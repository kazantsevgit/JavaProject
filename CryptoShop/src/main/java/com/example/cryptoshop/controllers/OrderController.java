package com.example.cryptoshop.controllers;


import com.example.cryptoshop.entities.Order;
import com.example.cryptoshop.entities.User;
import com.example.cryptoshop.service.OrderService;
import com.example.cryptoshop.service.UserService;
import com.example.cryptoshop.util.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Optional;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    private UserService userService;

    private ShoppingCart cart;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("")
    public String showOrders(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        model.addAttribute("user", user);
        model.addAttribute("orders", orderService.getCustomOrders(principal));
        return "orders";
    }

    @GetMapping("/order-details/{id}")
    public String toOrderDetails(Model model, @PathVariable("id") Long id) {
        Optional<Order> selectedOrder = Optional.ofNullable(orderService.getOrderById(id));
        model.addAttribute("selectedOrder", selectedOrder);
        return "order-details";
    }

    @GetMapping("/create_order")
    public String createOrder(Principal principal) {
        User user = userService.findByUsername(principal.getName());
        Order orderFromItems = orderService.createOrderFromItems(user, cart.getOrderItems());
        return "redirect:order-details/" + orderFromItems.getId();
    }

    @GetMapping({"/remove/{id}", "/order-details/remove/{id}"})
    public String deleteOrderById(@PathVariable("id") Long id) {
        orderService.deleteOrderById(id);
        return "redirect:/orders";
    }
}

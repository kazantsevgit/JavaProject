package com.example.cryptoshop.controllers;

import com.example.cryptoshop.dto.Crypto;
import com.example.cryptoshop.service.CryptoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("/")
public class MainController {

    CryptoService cryptoService;

    @GetMapping("/main")
    public String main(Model model) {
        List<Crypto> cryptos = cryptoService.getAllCryptos();
        model.addAttribute("cryptos", cryptos);
        return "MainPage";
    }
}

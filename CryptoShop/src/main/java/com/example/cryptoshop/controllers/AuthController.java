//package com.example.cryptoshop.controllers;
//
//import com.example.cryptoshop.dto.UserDTO;
//import com.example.cryptoshop.service.AuthService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping ("/api/auth")
//@RequiredArgsConstructor
//public class AuthController {
//    private final AuthService authService;
//
//    @PostMapping("/register")
//    public ResponseEntity<String> register(@RequestBody UserDTO request) {
//        authService.register(request);
//        return ResponseEntity.ok("User registered successfully");
//    }
//
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//}
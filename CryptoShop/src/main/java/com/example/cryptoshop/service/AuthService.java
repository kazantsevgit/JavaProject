//package com.example.cryptoshop.service;
//
//
//import com.example.cryptoshop.dto.UserDTO;
//import com.example.cryptoshop.entities.User;
//import com.example.cryptoshop.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class AuthService {
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    public void register(UserDTO request) {
//        if (userRepository.existsByEmail(request.getEmail())) {
//            throw new RuntimeException("Email already exists");
//        }
//
//        User user = new User();
//        user.setEmail(request.getEmail());
//        user.setPassword(passwordEncoder.encode(request.getPassword()));
//        user.setFirstName(request.getFirstName());
//        user.setLastName(request.getLastName());
//
//        userRepository.save(user);
//    }
//}
package com.example.cryptoshop.dto;

import lombok.Data;

@Data
public class Crypto {
    private Long id;
    private String name;
    private String description;
    private double price;
}

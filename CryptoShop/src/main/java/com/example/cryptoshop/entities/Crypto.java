package com.example.cryptoshop.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "Cryptos")
public class Crypto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;

}

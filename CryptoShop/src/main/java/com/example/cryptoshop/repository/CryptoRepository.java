package com.example.cryptoshop.repository;


import com.example.cryptoshop.entities.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoRepository extends JpaRepository<Crypto, Long> {
}

package com.example.cryptoshop.service;


import com.example.cryptoshop.dto.Crypto;
import com.example.cryptoshop.repository.CryptoRepository;

import java.util.List;
import java.util.Optional;

public class CryptoService {
    private final CryptoRepository cryptoRepository;

    public CryptoService(CryptoRepository cryptoRepository) {
        this.cryptoRepository = cryptoRepository;
    }

    public List<com.example.cryptoshop.entities.Crypto> getAllCryptos() {
        return cryptoRepository.findAll();
    }

    public Optional<Crypto> getCryptoById(Long id) {
        return cryptoRepository.findById(id);
    }

    public void buyCrypto(Long id, double amount) {
        // Логика покупки криптовалюты
    }

    public void sellCrypto(Long id, double amount) {
        // Логика продажи криптовалюты
    }
}


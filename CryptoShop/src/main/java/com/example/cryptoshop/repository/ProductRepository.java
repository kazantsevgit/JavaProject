package com.example.cryptoshop.repository;


import com.example.cryptoshop.entities.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Crypto, Long> {

    Crypto findOneByTitle(String title);

    List<Crypto> findAllByPriceBetween(int min, int max);
}

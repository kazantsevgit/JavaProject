package com.example.cryptoshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findOneByTitle(String title);

    List<Product> findAllByPriceBetween(int min, int max);
}

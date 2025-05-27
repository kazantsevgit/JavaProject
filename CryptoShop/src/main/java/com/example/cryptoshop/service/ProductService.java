package com.example.cryptoshop.service;

import com.example.cryptoshop.entities.Crypto;
import com.example.cryptoshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Crypto> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Crypto getProductById(Long id) {
        if (productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        }
        return null;
    }

    public Crypto getProductByTitle(String title) {
        return productRepository.findOneByTitle(title);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    // In future releases
    public void addProduct(Crypto product) {
        productRepository.save(product);
    }
}

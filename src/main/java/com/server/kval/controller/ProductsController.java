package com.server.kval.controller;

import com.server.kval.domain.Products;
import com.server.kval.repositories.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ProductsController {
    private final ProductsRepository productsRepository;

    @GetMapping("/api/product")
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @GetMapping("/api/product/{id}")
    public Products getOneProduct(@PathVariable Long id) {
        Optional<Products> products = productsRepository.findById(id);
        return products.isPresent() ? products.get() : null;
    }

    @PostMapping("/api/product")
    public Products createNewProduct(@RequestBody Products products) {
        return productsRepository.save(products);
    }
}

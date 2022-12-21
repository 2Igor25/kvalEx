package com.server.kval.controller;

import com.server.kval.domain.Categories;
import com.server.kval.repositories.CategoriesRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CategoriesController {

    private final CategoriesRepository categoriesRepository;

    @GetMapping("/api/category")
    public List<Categories> getAllCategories() {
        return  categoriesRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public Categories getCategories(@PathVariable Long id) {
        Optional<Categories> category = categoriesRepository.findById(id);
        return category.isPresent() ? category.get() : null;
    }

    @PostMapping("/api/category")
    public Categories createNewCategory(@RequestBody Categories category) {
        return categoriesRepository.save(category);
    }
}

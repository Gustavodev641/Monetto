package com.example.demo.controller;


import com.example.demo.Category.Category;
import com.example.demo.Category.CategoryRepository;
import com.example.demo.Category.CategoryRequestDTO;
import com.example.demo.Category.CategoryResponseDTO;
import com.example.demo.Transaction.Transaction;
import com.example.demo.Transaction.TransactionRepository;
import com.example.demo.Transaction.TransactionRequestDTO;
import com.example.demo.Transaction.TransactionResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {
    @Autowired
    private CategoryRepository repository;

    @PostMapping
    public Category saveCategory(@RequestBody CategoryRequestDTO data) {
        Category category = new Category(data);
        return repository.save(category);
    }
    @GetMapping
    public List<CategoryResponseDTO> getAll() {
        return repository.findAll().stream()
                .map(CategoryResponseDTO::new)
                .toList();
    }

}

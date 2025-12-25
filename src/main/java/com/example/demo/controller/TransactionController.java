package com.example.demo.controller;

import com.example.demo.Transaction.Transaction;
import com.example.demo.Transaction.TransactionRepository;
import com.example.demo.Transaction.TransactionResponseDTO;
import com.example.demo.Transaction.TransactionRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("transaction")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TransactionController {
    @Autowired
    private TransactionRepository repository;

    @PostMapping
    public Transaction saveTransaction(@RequestBody TransactionRequestDTO data) {
        Transaction transaction = new Transaction(data);
        return repository.save(transaction);
    }
    @GetMapping
    public List<TransactionResponseDTO> getAll() {
        return repository.findAll().stream()
                .map(TransactionResponseDTO::new)
                .toList();
    }
}

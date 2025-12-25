package com.example.demo.controller;


import com.example.demo.account.Account;
import com.example.demo.account.AccountRepository;
import com.example.demo.account.AccountRequestDTO;
import com.example.demo.account.AccountResponseDTO;
import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import com.example.demo.user.UserRequestDTO;
import com.example.demo.user.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountController {
    @Autowired
    private AccountRepository repository;

    @PostMapping
    public Account saveAccount(@RequestBody AccountRequestDTO data) {
        Account account = new Account(data);
        return repository.save(account);
    }
    @GetMapping
    public List<AccountResponseDTO> getAll() {
        return repository.findAll().stream()
                .map(AccountResponseDTO::new)
                .toList();
    }
}

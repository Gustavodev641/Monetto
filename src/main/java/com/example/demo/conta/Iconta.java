package com.example.demo.conta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Iconta extends JpaRepository<conta, String> {
    // Busca todas as contas de um usuário específico
    List<conta> findByUserId(String userId);
}

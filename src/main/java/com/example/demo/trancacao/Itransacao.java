package com.example.demo.trancacao;

import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface Itransacao extends JpaRepository<Transaction, Long> {
    // Busca transações por usuário ordenadas pela data mais recente
    List<Transaction> findByUserIdOrderByDataDesc(String userId);

    // Útil para os relatórios mensais
    List<Transaction> findByUserIdAndDataBetween(String userId, LocalDateTime start, LocalDateTime end);
}

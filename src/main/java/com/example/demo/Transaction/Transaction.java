package com.example.demo.Transaction;

import com.example.demo.Category.CategoryRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Transaction")
@Table(name = "tb_transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "category_id")
    private Long categoryId;

    private Double valor;
    private String descricao;
    private String data;
    private String tipo; // "ENTRADA" ou "SAIDA"
    private String status;

    public Transaction(TransactionRequestDTO data) {
    }

    public Transaction(CategoryRequestDTO data) {
    }
}

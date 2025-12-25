package com.example.demo.Transaction;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDTO {

    private Long userId;
    private Long accountId;
    private Long categoryId;
    private Double valor;
    private String descricao;
    private String data;
    private String tipo;
    private String status;

    public TransactionResponseDTO(String status, String tipo, String data, String descricao, Double valor, Long userId, Long accountId, Long categoryId) {
        this.status = status;
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.userId = userId;
        this.accountId = accountId;
        this.categoryId = categoryId;
    }
    public TransactionResponseDTO(Transaction transaction) {

    }

}

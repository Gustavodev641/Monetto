package com.example.demo.conta;

public record ContaRequestDTO (
        String user_id,
        String nome,
        String tipo,
        Double saldo_init,
        Double saldo_atual
)
{ }

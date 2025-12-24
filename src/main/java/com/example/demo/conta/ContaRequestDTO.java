package com.example.demo.conta;

public record ContaRequestDTO (
        String user_id,
        String nome,
        String tipo,
        String saldo_init,
        String saldo_atual
)
{ }

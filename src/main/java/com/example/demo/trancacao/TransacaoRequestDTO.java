package com.example.demo.trancacao;

public record TransacaoRequestDTO (
        String user_id,
        String account_id,
        String category_id,
        String descricao,
        Double valor,
        String data,
        String tipo,
        String status

)
{ }

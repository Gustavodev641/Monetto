package com.example.demo.categorias;

public record CategoriaRequestDTO (
        Long id,
        String user_id,
        String nome,
        String tipo,
        String cor_hex,
        String icone

)
{ }

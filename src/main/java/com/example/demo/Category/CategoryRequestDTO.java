package com.example.demo.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record CategoryRequestDTO (Long user_id, String nome, String tipo, String cor_hex, String icone){

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class CategoryResponseDTO {
        private String nome;
        private String tipo;
        private Double cor_hex;
        private Double icone;

    }
}

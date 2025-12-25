package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record UserRequestDTO(String nome, String email, String password, String moeda_padrao, String data_criacao, String telefone, String cpf) {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class UserResponseDTO {
        private String nome;
        private String email;
        private String cpf;
        private String telefone;
        private String moeda_padrao;
        private String data_criacao;
    }

}


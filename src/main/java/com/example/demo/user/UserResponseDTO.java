package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String moeda_padrao;
    private String data_criacao;

}

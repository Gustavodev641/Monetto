package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

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

    public UserResponseDTO(Long id, String nome, String email, String cpf, String telefone, String moeda_padrao, String data_criacao){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.moeda_padrao = moeda_padrao;
    }
    public UserResponseDTO(User user) {

    }

}

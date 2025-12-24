package com.example.demo.user;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "User")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@EqualsAndHashCode()

public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "Email")
    private String Email;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @Column(name ="password")
    private String password;

    @Column(name = "moeda_padrao")
    private String moeda_padrao;

    @Column(name = "data_criacao")
    private String data_criacao;

}

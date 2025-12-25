package com.example.demo.user;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Table(name = "users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "CPF", unique = true)
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "moeda_padrao")
    private String moeda_padrao;

    @Column(name = "data_criacao")
    private String data_criacao;

    public User(@NotNull UserRequestDTO data) {
        this.name = data.nome();
        this.email = data.email();
        this.cpf = data.cpf();
        this.telefone = data.telefone();
        this.data_criacao = data.data_criacao();
        this.password = data.password();
        this.moeda_padrao = data.moeda_padrao();
    }
}

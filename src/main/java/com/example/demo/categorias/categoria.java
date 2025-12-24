package com.example.demo.categorias;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor

public class categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "nome")
    private String nome;

    @Column(name ="tipo")
    private String tipo;

    @Column(name = "cor_hex")
    private String cor_hex;

    @Column(name = "icone")
    private String icone;
}

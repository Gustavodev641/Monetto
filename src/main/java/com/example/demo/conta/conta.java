package com.example.demo.conta;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "nome")
    private String nome;

    @Column(name ="tipo")
    private String tipo;

    @Column(name = "saldo_init")
    private String saldo_init;

    @Column(name = "saldo_atual")
    private String saldo_atual;
}

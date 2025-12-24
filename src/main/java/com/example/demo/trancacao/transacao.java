package com.example.demo.trancacao;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "account_id")
    private String account_id;

    @Column(name ="category_id")
    private String category_id;

    @Column(name = "valor")
    private String valor;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data")
    private String data;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "status")
    private String status;
}

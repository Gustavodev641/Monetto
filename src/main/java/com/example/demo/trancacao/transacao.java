package com.example.demo.trancacao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor

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
    private Double valor;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data")
    private String data;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "status")
    private String status;
}

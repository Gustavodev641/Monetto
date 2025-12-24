package com.example.demo.conta;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
public class conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private String userId;

    @Column(name = "nome")
    private String nome;

    @Column(name ="tipo")
    private String tipo;

    @Column(name = "saldo_init")
    private Double saldo_init;

    @Column(name = "saldo_atual")
    private Double saldo_atual;
}

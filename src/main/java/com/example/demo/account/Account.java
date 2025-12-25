package com.example.demo.account;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "account")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", unique = true)
    private Long user_id;

    @Column(name = "nome_conta")
    private String nome_conta;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "saldo_init")
    private Double saldo_init;

    @Column(name = "saldo_atual")
    private Double saldo_atual;


    public Account(AccountRequestDTO data) {
    }
}

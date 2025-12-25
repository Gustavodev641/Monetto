package com.example.demo.account;

import com.example.demo.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDTO {
    private Double saldo_atual;
    private Double saldo_init;
    private String nome_conta;
    private String tipo;

    public AccountResponseDTO(String nome_conta, String tipo, Double saldo_init, Double saldo_atual){
        this.nome_conta = nome_conta;
        this.tipo = tipo;
        this.saldo_init = saldo_init;
        this.saldo_atual = saldo_atual;
    }
    public AccountResponseDTO(Account account) {

    }

}

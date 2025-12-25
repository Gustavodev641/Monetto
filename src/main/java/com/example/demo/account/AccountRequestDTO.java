package com.example.demo.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record AccountRequestDTO(String nome_conta, String tipo, Double saldo_init, Double saldo_atual) {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class AccountResponseDTO {
        private String nome_conta;
        private String tipo;
        private Double saldo_init;
        private Double saldo_atual;

    }
}

package com.example.demo.conta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaResponseDTO {

    private Long id;
    private String user_id;
    private String nome;
    private String tipo;
    private Double saldo_init;
    private Double saldo_atual;
}

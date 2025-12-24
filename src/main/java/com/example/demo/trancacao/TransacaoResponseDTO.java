package com.example.demo.trancacao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoResponseDTO {
    private long id;
    private String user_id;
    private String account_id;
    private String category_id;
    private String valor;
    private String descricao;
    private String data;
    private String tipo;
    private String status;
}

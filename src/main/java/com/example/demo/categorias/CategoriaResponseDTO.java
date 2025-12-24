package com.example.demo.categorias;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaResponseDTO {
    private String user_id;
    private String nome;
    private String tipo;
    private String cor_hex;
    private String icone;

}

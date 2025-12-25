package com.example.demo.Category;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponseDTO {

    private Long id;
    private String nome;
    private String tipo;
    private String cor_hex;
    private String icone;
    public CategoryResponseDTO(Category categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
        this.tipo = categoria.getTipo();
        this.cor_hex = categoria.getCor_hex();
        this.icone = categoria.getIcone();
    }
}

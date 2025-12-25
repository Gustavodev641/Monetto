package com.example.demo.Category;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;
    private String nome;
    private String tipo;
    private String cor_hex;
    private String icone;

    public Category(CategoryRequestDTO data) {
        this.userId = data.user_id();
        this.nome = data.nome();
        this.tipo = data.tipo();
        this.cor_hex = data.cor_hex();
        this.icone = data.icone();
    }
}

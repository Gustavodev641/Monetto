package com.example.demo.categorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Icategoria extends JpaRepository<categoria, Long> {
    // Busca as categorias padrão (null) e as específicas do usuário
    List<categoria> findByUserIdOrUserIdIsNull(String userId);
}

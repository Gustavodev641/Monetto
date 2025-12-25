package com.example.demo.Category;

import com.example.demo.Transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

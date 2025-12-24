package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Iuser extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}

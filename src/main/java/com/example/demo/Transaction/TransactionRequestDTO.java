package com.example.demo.Transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record TransactionRequestDTO(Long user_id, Long account_id) {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class TrasactionRequestDTO {
        private Long user_id;
        private Long account_id;
    }
}

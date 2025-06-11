package com.budgetmantri.backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("transactions")
public class Transaction {
    @Id
    private String id;
    private String type;
    private String category;
    private double amount;
    private String note;
}

package com.budgetmantri.backend.repository;

import com.budgetmantri.backend.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}

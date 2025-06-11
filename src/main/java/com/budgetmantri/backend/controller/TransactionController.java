package com.budgetmantri.backend.controller;

import com.budgetmantri.backend.model.Transaction;
import com.budgetmantri.backend.repository.TransactionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "http://localhost:3000")
public class TransactionController {

    private final TransactionRepository repo;

    public TransactionController(TransactionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction txn) {
        return repo.save(txn);
    }
}

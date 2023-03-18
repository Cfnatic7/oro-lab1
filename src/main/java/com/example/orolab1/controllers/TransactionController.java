package com.example.orolab1.controllers;

import com.example.orolab1.rdmbs.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/count")
    public long countTransactions() {
        return transactionRepository.count();
    }

    @GetMapping("/count/part/{partId}")
    public long countTransactionsByPart(@PathVariable Long partId) {
        return transactionRepository.countByPartId(partId);
    }

    @GetMapping("/count/user/{userId}")
    public long countTransactionsByUser(@PathVariable Long userId) {
        return transactionRepository.countByUserId(userId);
    }
}

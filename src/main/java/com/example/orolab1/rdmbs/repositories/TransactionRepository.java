package com.example.orolab1.rdmbs.repositories;

import com.example.orolab1.rdmbs.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    long countByPartId(Long partId);
    long countByUserId(Long userId);
}

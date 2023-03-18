package com.example.orolab1.rdmbs.repositories;

import com.example.orolab1.rdmbs.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
    List<Part> findByPriceBetween(int minPrice, int maxPrice);
}

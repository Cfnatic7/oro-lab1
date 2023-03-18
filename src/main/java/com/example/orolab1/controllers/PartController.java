package com.example.orolab1.controllers;

import com.example.orolab1.dtos.PartDto;
import com.example.orolab1.mappers.PartMapper;
import com.example.orolab1.rdmbs.models.Part;
import com.example.orolab1.rdmbs.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parts")
public class PartController {

    @Autowired
    private PartRepository partRepository;

    @Autowired
    private PartMapper partMapper;

    @GetMapping("/by-price-range")
    public ResponseEntity<List<PartDto>> getPartsByPriceRange(
            @RequestParam("minPrice") int minPrice,
            @RequestParam("maxPrice") int maxPrice) {
        if (minPrice > maxPrice) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        List<Part> parts = partRepository.findByPriceBetween(minPrice, maxPrice);
        List<PartDto> partDtos = parts.stream().map(part -> partMapper.mapToDto(part)).toList();
        return ResponseEntity.ok(partDtos);
    }
}

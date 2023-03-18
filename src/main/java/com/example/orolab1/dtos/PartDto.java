package com.example.orolab1.dtos;

import com.example.orolab1.rdmbs.models.Part;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link Part} entity
 */
@Data
@Builder
public class PartDto implements Serializable {
    private final Long id;
    private final String name;
    private final int price;
    private final String categoryName;
    private final List<String> carModels;
}
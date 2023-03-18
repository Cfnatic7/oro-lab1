package com.example.orolab1.dtos;

import com.example.orolab1.rdmbs.models.Category;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Category} entity
 */
@Data
@Builder
public class CategoryDto implements Serializable {
    private final Long id;
    private final String name;
}
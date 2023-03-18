package com.example.orolab1.dtos;

import com.example.orolab1.rdmbs.models.CarModel;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link CarModel} entity
 */
@Data
@Builder
public class CarModelDto implements Serializable {
    private final Long id;
    private final String name;
}
package com.example.orolab1.mappers;

import com.example.orolab1.dtos.PartDto;
import com.example.orolab1.rdmbs.models.CarModel;
import com.example.orolab1.rdmbs.models.Part;
import org.springframework.stereotype.Component;

@Component
public class PartMapper {

    public PartDto mapToDto(Part part) {
        return PartDto
                .builder()
                .id(part.getId())
                .name(part.getName())
                .price(part.getPrice())
                .categoryName(part
                        .getCategory()
                        .getName())
                .carModels(part.getCarModels()
                        .stream()
                        .map(CarModel::getName)
                        .toList())
                .build();
    }
}

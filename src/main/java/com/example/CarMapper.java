package com.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author tylerthrailkill
 */
@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "wheel.bolt.size", target = "wheel.bolt.size"),
            @Mapping(source = "wheel.bolt.type", target = "wheel.bolt.type")
    })
    void updateTruckWithCarDetails(Car car, @MappingTarget Truck truck);
}

package com.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.example.stuff.PropertyRegisteredEvent;

/**
 *
 */
@Mapper(componentModel = "spring")
public abstract class XsdMapper {
    public static final XsdMapper INSTANCE = Mappers.getMapper(XsdMapper.class);

    @Mapping(source = "property.propertyDetails.yearBuilt", target = "loanApplication.PROPERTY.structureBuiltYear")
    abstract void updateFromProperty(PropertyRegisteredEvent event, @MappingTarget FannieMaeFile file);
}

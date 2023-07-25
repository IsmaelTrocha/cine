package com.cineworld.cw.infrastructure.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CountryDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ActorDtoMapper {

}

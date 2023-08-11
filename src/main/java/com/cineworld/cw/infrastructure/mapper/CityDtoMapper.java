package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.City;
import com.cineworld.cw.infrastructure.repository.city.CityDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CountryDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CityDtoMapper extends EntityToDto<CityDto, City> {

}

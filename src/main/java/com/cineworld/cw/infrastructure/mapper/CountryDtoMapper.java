package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.infrastructure.repository.country.CountryDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryDtoMapper extends EntityToDto<CountryDto, Country> {

}

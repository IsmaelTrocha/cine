package com.cineworld.cw.infrastructure.api.mapper.response;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.infrastructure.api.dto.response.CountryResponse;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryResponseMapper extends EntityToDto<CountryResponse, Country> {

}

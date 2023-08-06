package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.infrastructure.api.dto.request.CountryRequest;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CountryRequestMapper extends EntityToDto<CountryRequest, Country> {

}

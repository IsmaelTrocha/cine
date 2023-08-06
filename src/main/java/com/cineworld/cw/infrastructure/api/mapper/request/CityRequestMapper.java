package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.City;
import com.cineworld.cw.infrastructure.api.dto.request.CityRequest;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
  CountryRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CityRequestMapper  {

  @Mapping(source = "countryId",target = "countryId.id")
  City toEntity(CityRequest cityRequest);
}

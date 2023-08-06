package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.infrastructure.api.dto.request.AddressRequest;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CityRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressRequestMapper extends EntityToDto<AddressRequest, Address> {

  @Mapping(source = "cityId", target = "cityId.id")
  Address toEntity(AddressRequest addressRequest);
}

package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.infrastructure.api.dto.request.AddressRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CityRequestMapper.class,
    CustomerRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressRequestMapper {

  @Mapping(source = "cityId", target = "cityId.id")
  @Mapping(source = "customerId",target = "customer.id")
  Address toEntity(AddressRequest addressRequest);
}

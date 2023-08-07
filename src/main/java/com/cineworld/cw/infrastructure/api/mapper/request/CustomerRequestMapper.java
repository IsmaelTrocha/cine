package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.infrastructure.api.dto.request.CustomerRequest;
import com.cineworld.cw.infrastructure.api.dto.request.UpdateCustomerRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    AddressRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerRequestMapper {

  Customer toEntity(UpdateCustomerRequest updateCustomerRequest);

  Customer toEntity(CustomerRequest updateCustomerRequest);
}

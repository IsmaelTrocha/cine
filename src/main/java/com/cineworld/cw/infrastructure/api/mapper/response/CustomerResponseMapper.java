package com.cineworld.cw.infrastructure.api.mapper.response;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.infrastructure.api.dto.response.CustomerResponse;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    AddressResponseMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerResponseMapper extends EntityToDto<CustomerResponse, Customer> {

  CustomerResponse toDto(Customer customer);
}

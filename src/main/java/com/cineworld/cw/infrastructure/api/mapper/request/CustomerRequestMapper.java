package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.infrastructure.api.dto.request.CustomerRequest;
import com.cineworld.cw.infrastructure.api.dto.request.UpdateCustomerRequest;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    AddressRequestMapper.class
})
public interface CustomerRequestMapper extends EntityToDto<CustomerRequest, Customer> {

  Customer toEntity(UpdateCustomerRequest updateCustomerRequest);
}

package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.infrastructure.repository.customer.CustomerDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CustomerDtoMapper extends EntityToDto<CustomerDto, Customer> {

}

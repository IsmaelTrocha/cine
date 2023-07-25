package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.infrastructure.repository.customer.CustomerDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    AddressDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerDtoMapper extends EntityToDto<CustomerDto, Customer> {

}

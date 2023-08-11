package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.infrastructure.repository.address.AddressDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CityDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressDtoMapper extends EntityToDto<AddressDto, Address> {

}

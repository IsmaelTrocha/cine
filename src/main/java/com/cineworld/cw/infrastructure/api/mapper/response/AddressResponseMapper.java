package com.cineworld.cw.infrastructure.api.mapper.response;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.infrastructure.api.dto.response.AddressResponse;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface AddressResponseMapper  extends EntityToDto<AddressResponse, Address> {

}

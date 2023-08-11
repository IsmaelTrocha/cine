package com.cineworld.cw.infrastructure.adapter.address;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.domain.services.address.CreateAddressService;
import com.cineworld.cw.infrastructure.mapper.AddressDtoMapper;
import com.cineworld.cw.infrastructure.repository.address.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateAddressAdapter implements CreateAddressService {

  private final AddressRepository addressRepository;
  private final AddressDtoMapper addressDtoMapper;


  @Override
  public Address createAddress(Address address) {
    return addressDtoMapper.toEntity(addressRepository.save(addressDtoMapper.toDto(address)));
  }
}

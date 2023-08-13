package com.cineworld.cw.infrastructure.adapter.address;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.domain.services.address.GetAddressService;
import com.cineworld.cw.infrastructure.mapper.AddressDtoMapper;
import com.cineworld.cw.infrastructure.repository.address.AddressRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetAddressAdapter implements GetAddressService {

  private final AddressRepository addressRepository;
  private final AddressDtoMapper addressDtoMapper;

  @Override
  public List<Address> addressByCustomerIdIn(Long id) {
    return addressDtoMapper.toEntity(addressRepository.addressByCustomerIdIn(id));
  }
}

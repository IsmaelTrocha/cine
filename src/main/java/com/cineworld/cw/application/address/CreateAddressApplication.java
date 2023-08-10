package com.cineworld.cw.application.address;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.domain.services.address.CreateAddressService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateAddressApplication {

  private final CreateAddressService createAddressService;

  public Address createAddress(Address address) {
    return createAddressService.createAddress(address);
  }
}

package com.cineworld.cw.application.address;

import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.domain.services.address.GetAddressService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAddressApplication {

  private final GetAddressService getAddressService;

  public List<Address> addressByCustomerIdIn(Long id) {
    return getAddressService.addressByCustomerIdIn(id);
  }
}

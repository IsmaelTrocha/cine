package com.cineworld.cw.domain.services.address;

import com.cineworld.cw.domain.entities.Address;
import java.util.List;

public interface GetAddressService {

  List<Address> addressByCustomerIdIn(Long id);
}

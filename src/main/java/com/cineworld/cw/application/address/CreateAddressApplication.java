package com.cineworld.cw.application.address;

import com.cineworld.cw.application.customer.GetCustomerApplication;
import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.address.CreateAddressService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateAddressApplication {

  private final CreateAddressService createAddressService;
  private final GetCustomerApplication getCustomerApplication;

  public Address createAddress(Address address) {
    Customer customer = getCustomerApplication.findById(address.getCustomer().getId());
    address.setCustomer(customer);
    return createAddressService.createAddress(address);

  }
}

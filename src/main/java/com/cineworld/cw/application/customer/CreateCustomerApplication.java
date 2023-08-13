package com.cineworld.cw.application.customer;

import com.cineworld.cw.application.address.CreateAddressApplication;
import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.CreateCustomerService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCustomerApplication {

  private final CreateCustomerService createCustomerService;
  private final CreateAddressApplication createAddressApplication;

  public Customer createCustomer(Customer customer, String createAt) {
    customer.setCreateAt(createAt);
    customer.setCreationDate(LocalDateTime.now());
    customer.setActive(Boolean.TRUE);
    return createCustomerService.create(customer);
  }
}

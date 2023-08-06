package com.cineworld.cw.application.customer;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.CreateCustomerService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCustomerApplication {

  private final CreateCustomerService createCustomerService;

  public Customer createCustomer(Customer customer) {
    return createCustomerService.create(customer);
  }
}

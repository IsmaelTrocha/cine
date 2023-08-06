package com.cineworld.cw.application.customer;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.UpdateCustomerService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateCustomerApplication {

  private final UpdateCustomerService updateCustomerService;

  public Customer updateCustomer(Customer customer) {
    return updateCustomerService.updateCustomer(customer);
  }
}

package com.cineworld.cw.application.customer;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.GetCustomerService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCustomerApplication {

  private final GetCustomerService getCustomerService;

  public Customer findById(Long id) {
    return getCustomerService.findById(id);
  }

  public List<Customer> findAll() {
    return getCustomerService.findAll();
  }

  public List<Customer> findAllByName(String name) {
    return getCustomerService.findAllByName(name);
  }
}

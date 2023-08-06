package com.cineworld.cw.domain.services.customer;

import com.cineworld.cw.domain.entities.Customer;
import java.util.List;

public interface GetCustomerService {

  List<Customer> findAll();

  Customer findById(Long id);

  List<Customer> findAllByName(String name);


}

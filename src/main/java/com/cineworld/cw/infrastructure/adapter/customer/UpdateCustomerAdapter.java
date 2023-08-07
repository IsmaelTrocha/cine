package com.cineworld.cw.infrastructure.adapter.customer;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.UpdateCustomerService;
import com.cineworld.cw.infrastructure.mapper.CustomerDtoMapper;
import com.cineworld.cw.infrastructure.repository.customer.CustomerRepository;
import com.cineworld.cw.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UpdateCustomerAdapter implements UpdateCustomerService {

  private final CustomerRepository customerRepository;
  private final MessageUtils messageUtils;
  private final CustomerDtoMapper customerDtoMapper;

  @Override
  public Customer updateCustomer(Customer customer) {
    return null;
  }
}

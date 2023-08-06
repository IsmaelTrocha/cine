package com.cineworld.cw.infrastructure.adapter.customer;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.CreateCustomerService;
import com.cineworld.cw.infrastructure.mapper.CustomerDtoMapper;
import com.cineworld.cw.infrastructure.repository.customer.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateCustomerAdapter implements CreateCustomerService {

  private final CustomerRepository customerRepository;
  private final CustomerDtoMapper customerDtoMapper;

  @Override
  public Customer create(Customer customer) {
    return customerDtoMapper.toEntity(customerRepository.save(customerDtoMapper.toDto(customer)));
  }
}

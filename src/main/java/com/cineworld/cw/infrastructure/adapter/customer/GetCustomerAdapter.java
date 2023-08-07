package com.cineworld.cw.infrastructure.adapter.customer;

import com.cineworld.cw.domain.entities.Customer;
import com.cineworld.cw.domain.services.customer.GetCustomerService;
import com.cineworld.cw.infrastructure.mapper.CustomerDtoMapper;
import com.cineworld.cw.infrastructure.repository.customer.CustomerRepository;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import com.cineworld.cw.shared.messages.customer.CustomerNotFoundException;
import com.cineworld.cw.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetCustomerAdapter implements GetCustomerService {

  private final MessageUtils messageUtils;
  private final CustomerDtoMapper customerDtoMapper;
  private final CustomerRepository customerRepository;

  @Override
  public List<Customer> findAll() {
    return customerDtoMapper.toEntity(customerRepository.findAll());
  }

  @Override
  public Customer findById(Long id) {
    return customerDtoMapper.toEntity(customerRepository.findById(id)
        .orElseThrow(() -> new CustomerNotFoundException(messageUtils.getMessage(
            ExceptionCode.CUSTOMER_INACTIVE.getType(), id.toString()))));
  }

  @Override
  public List<Customer> findAllByName(String name) {
    return customerDtoMapper.toEntity(customerRepository.findByFirstName(name));
  }
}

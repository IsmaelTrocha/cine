package com.cineworld.cw.infrastructure.api.controller.customer;

import static com.cineworld.cw.shared.utils.CustomHeader.X_AUTH_EMAIL;

import com.cineworld.cw.application.address.GetAddressApplication;
import com.cineworld.cw.application.customer.CreateCustomerApplication;
import com.cineworld.cw.application.customer.GetCustomerApplication;
import com.cineworld.cw.application.customer.UpdateCustomerApplication;
import com.cineworld.cw.domain.entities.Address;
import com.cineworld.cw.infrastructure.api.dto.request.CustomerRequest;
import com.cineworld.cw.infrastructure.api.dto.response.CreateResponse;
import com.cineworld.cw.infrastructure.api.dto.response.CustomerResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.CustomerRequestMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.AddressResponseMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.CustomerResponseMapper;
import com.cineworld.cw.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/customer")
@AllArgsConstructor
public class CustomerController {

  private final CreateCustomerApplication createCustomerApplication;
  private final GetCustomerApplication getCustomerApplication;
  private final UpdateCustomerApplication updateCustomerApplication;
  private final MessageUtils messageUtils;
  private final CustomerRequestMapper customerRequestMapper;
  private final CustomerResponseMapper customerResponseMapper;
  private final GetAddressApplication getAddressApplication;
  private final AddressResponseMapper addressResponseMapper;

  @PostMapping
  public ResponseEntity<CreateResponse> createCustomer(@RequestBody CustomerRequest customerRequest,
      @RequestHeader(X_AUTH_EMAIL) String createAt) {
    createCustomerApplication.createCustomer(customerRequestMapper.toEntity(customerRequest),
        createAt);
    return new ResponseEntity<>(new CreateResponse("201", "", ""), HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<CustomerResponse> getCustomerById(
      @PathVariable("id") Long id) {
    List<Address> addresses = getAddressApplication.addressByCustomerIdIn(id);
    CustomerResponse customerResponse = customerResponseMapper.toDto(
        getCustomerApplication.findById(id));
    customerResponse.setAddress(addressResponseMapper.toDto(addresses));
    return new ResponseEntity<>(customerResponse,
        HttpStatus.OK);
  }

  @GetMapping(value = "/get/{name}")
  public ResponseEntity<List<CustomerResponse>> getCustomerByName(
      @PathVariable("name") String name) {
    return new ResponseEntity<>(
        customerResponseMapper.toDto(getCustomerApplication.findAllByName(name)),
        HttpStatus.OK);
  }
}

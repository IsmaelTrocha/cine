package com.cineworld.cw.infrastructure.api.controller.customer;

import static com.cineworld.cw.shared.utils.CustomHeader.X_AUTH_EMAIL;

import com.cineworld.cw.application.customer.CreateCustomerApplication;
import com.cineworld.cw.application.customer.GetCustomerApplication;
import com.cineworld.cw.application.customer.UpdateCustomerApplication;
import com.cineworld.cw.infrastructure.api.dto.request.CustomerRequest;
import com.cineworld.cw.infrastructure.api.dto.request.UpdateCustomerRequest;
import com.cineworld.cw.infrastructure.api.dto.response.CreateResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.CustomerRequestMapper;
import com.cineworld.cw.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

  @PostMapping
  public ResponseEntity<CreateResponse> createCustomer(@RequestBody CustomerRequest customerRequest,
      @RequestHeader(X_AUTH_EMAIL) String createAt) {
    createCustomerApplication.createCustomer(customerRequestMapper.toEntity(customerRequest));
    return new ResponseEntity<>(new CreateResponse("201", "", ""), HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<CreateResponse> updateCustomer(
      @RequestBody UpdateCustomerRequest updateCustomerRequest,
      @RequestHeader(X_AUTH_EMAIL) String updateAt) {
    updateCustomerApplication.updateCustomer(customerRequestMapper.toEntity(updateCustomerRequest));
    return new ResponseEntity<>(new CreateResponse("201", "", ""), HttpStatus.OK);

  }
}

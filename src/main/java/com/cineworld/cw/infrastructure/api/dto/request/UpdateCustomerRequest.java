package com.cineworld.cw.infrastructure.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {

  private String firstName;
  private String secondName;
  private String firstSurname;
  private String secondSurname;
  private String email;
  private AddressRequest address;

}

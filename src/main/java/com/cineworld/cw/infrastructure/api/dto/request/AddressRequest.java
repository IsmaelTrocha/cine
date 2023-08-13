package com.cineworld.cw.infrastructure.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {

  private String address;
  private String street;
  private String avenue;
  private Long cityId;
  private String postalCode;
  private Long customerId;
}

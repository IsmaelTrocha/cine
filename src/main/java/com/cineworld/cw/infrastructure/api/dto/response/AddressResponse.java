package com.cineworld.cw.infrastructure.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

  private String address;
  private String street;
  private String avenue;
  private CityResponse cityId;
  private String postalCode;
  private String lastUpdate;
}

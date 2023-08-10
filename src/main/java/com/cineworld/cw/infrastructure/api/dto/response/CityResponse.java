package com.cineworld.cw.infrastructure.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityResponse {

  private Long id;
  private String name;
  private CountryResponse countryId;
}

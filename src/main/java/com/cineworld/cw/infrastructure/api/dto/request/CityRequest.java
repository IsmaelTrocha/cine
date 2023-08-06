package com.cineworld.cw.infrastructure.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityRequest {

  private String name;
  private Long countryId;
}

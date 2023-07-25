package com.cineworld.cw.infrastructure.repository.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {

  private Long id;
  private String name;
  private String lastUpdate;
}

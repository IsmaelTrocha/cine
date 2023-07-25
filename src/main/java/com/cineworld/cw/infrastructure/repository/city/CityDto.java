package com.cineworld.cw.infrastructure.repository.city;

import com.cineworld.cw.infrastructure.repository.country.CountryDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
  private Long id;
  private String name;
  private CountryDto countryId;
}

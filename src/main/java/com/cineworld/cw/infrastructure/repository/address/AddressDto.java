package com.cineworld.cw.infrastructure.repository.address;

import com.cineworld.cw.infrastructure.repository.city.CityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

  private Long id;
  private String address;
  private CityDto cityId;
  private String postalCode;
  private String lastUpdate;
}

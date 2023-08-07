package com.cineworld.cw.application.country;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.domain.services.country.UpdateCountryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateCountryApplication {

  private final UpdateCountryService updateCountryService;

  public void updateCountry(Country country,String updatedAt){
    updateCountryService.updateCountry(country);
  }
}

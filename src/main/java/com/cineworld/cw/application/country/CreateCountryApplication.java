package com.cineworld.cw.application.country;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.domain.services.country.CreateCountryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCountryApplication {

  private final CreateCountryService createCountryService;

  public Country createCountry(Country country){
    return createCountryService.create(country);
  }
}
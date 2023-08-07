package com.cineworld.cw.application.country;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.domain.services.country.GetCountryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCountryApplication {

  private final GetCountryService getCountryService;

  public Country findById(Long id) {
    return getCountryService.findById(id);
  }
}

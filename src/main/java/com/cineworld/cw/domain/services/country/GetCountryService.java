package com.cineworld.cw.domain.services.country;

import com.cineworld.cw.domain.entities.Country;

public interface GetCountryService {

  Country findById(Long id);
}

package com.cineworld.cw.infrastructure.api.controller.country;

import com.cineworld.cw.application.country.GetCountryApplication;
import com.cineworld.cw.infrastructure.api.dto.response.CountryResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.CountryRequestMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.CountryResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/country")
public class CountryController {

  private final GetCountryApplication getCountryApplication;
  private final CountryRequestMapper countryRequestMapper;
  private final CountryResponseMapper countryResponseMapper;


  @GetMapping(value = "/{id}")
  public ResponseEntity<CountryResponse> findById(@PathVariable("id") Long id) {
    return new ResponseEntity<>(countryResponseMapper.toDto(getCountryApplication.findById(id)),
        HttpStatus.OK);
  }
}

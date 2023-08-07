package com.cineworld.cw.infrastructure.adapter.country;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.domain.services.country.GetCountryService;
import com.cineworld.cw.infrastructure.mapper.CountryDtoMapper;
import com.cineworld.cw.infrastructure.repository.country.CountryRepository;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import com.cineworld.cw.shared.messages.country.CountryNotFoundException;
import com.cineworld.cw.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetCountryAdapter implements GetCountryService {

  private final CountryRepository countryRepository;
  private final CountryDtoMapper countryDtoMapper;
  private final MessageUtils messageUtils;


  @Override
  public Country findById(Long id) {
    return countryDtoMapper.toEntity(countryRepository.findById(id)
        .orElseThrow(() -> new CountryNotFoundException(messageUtils.getMessage(
            ExceptionCode.COUNTRY_NOT_FOUND.getType(), id.toString()))));
  }
}

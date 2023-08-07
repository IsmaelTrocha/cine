package com.cineworld.cw.shared.messages.country;

import com.cineworld.cw.shared.exception.base.BaseException;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CountryNotFoundException extends BaseException {


  public CountryNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.COUNTRY_NOT_FOUND);
  }
}

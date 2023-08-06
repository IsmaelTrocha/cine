package com.cineworld.cw.shared.messages.film;

import com.cineworld.cw.shared.exception.base.BaseException;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class FilmNotFoundException extends BaseException {

  public FilmNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.MOVIE_NOT_FOUND);
  }


}

package com.cineworld.cw.shared.messages.category;

import com.cineworld.cw.shared.exception.BaseException;
import com.cineworld.cw.shared.exception.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CategoryNotFoundException extends BaseException {

  public CategoryNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.CATEGORY_NOT_FOUND);
  }
}

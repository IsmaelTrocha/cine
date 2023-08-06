package com.cineworld.cw.shared.messages.customer;

import com.cineworld.cw.shared.exception.base.BaseException;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CustomerInactiveException extends BaseException {

  public CustomerInactiveException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.CUSTOMER_INACTIVE);
  }
}

package com.cineworld.cw.shared.messages.customer;

import com.cineworld.cw.shared.exception.base.BaseException;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CustomerNotFoundException extends BaseException {

  public CustomerNotFoundException(String message){
    super(false, HttpStatus.NOT_FOUND,message, ExceptionCode.CUSTOMER_NOT_FOUND);
  }
}

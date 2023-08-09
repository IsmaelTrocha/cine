package com.cineworld.cw.shared.messages.actor;

import com.cineworld.cw.shared.exception.base.BaseException;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class ActorNotFoundException extends BaseException {


  public ActorNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.ACTOR_NOT_FOUND);
  }
}

package com.cineworld.cw.shared.exception.code;

import lombok.Getter;

@Getter
public enum MessageCode {

  SUCCESSFUL("Message-01", "Message.SUCCESSFUL"),
  FILM_SAVE_SUCCESSFUL("Message-02", "Message.FILM_CREATE_SUCCESSFUL");

  private final String code;
  private final String type;

  MessageCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}

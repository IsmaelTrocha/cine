package com.cineworld.cw.shared.exception;
import lombok.Getter;

@Getter
public enum ExceptionCode {
  MOVIE_NOT_FOUND("ERR-001", "MOVIE_NOT_FOUND"),
  MOVIE_INACTIVE("ERR-002", "MOVIE_INACTIVE"),
  CATEGORY_NOT_FOUND("ERR-03", "Exception.CATEGORY_NOT_FOUND");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}

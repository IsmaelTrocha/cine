package com.cineworld.cw.shared.exception.code;
import lombok.Getter;

@Getter
public enum ExceptionCode {
  MOVIE_NOT_FOUND("ERR-001", "Exception.MOVIE_NOT_FOUND"),
  MOVIE_INACTIVE("ERR-002", "Exception.MOVIE_INACTIVE"),
  CATEGORY_NOT_FOUND("ERR-03", "Exception.CATEGORY_NOT_FOUND"),
  CUSTOMER_NOT_FOUND("ERR-04","Exception.CUSTOMER_NOT_FOUND"),
  CUSTOMER_INACTIVE("ERR-05","Exception.CUSTOMER_INACTIVE"),
  COUNTRY_NOT_FOUND("ERR-06","Exception.COUNTRY_NOT_FOUND"),
  ACTOR_NOT_FOUND("ERR-07","Exception.ACTOR_NOT_FOUND");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}

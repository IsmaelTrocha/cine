package com.cineworld.cw.infrastructure.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ActorResponse {

  private Long id;
  private String firstName;
  private String lastName;
  private CountryResponse countryId;
  private String email;
  private int age;

}

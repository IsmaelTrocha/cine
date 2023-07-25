package com.cineworld.cw.infrastructure.api.dto.response;

import com.cineworld.cw.domain.entities.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorResponse {

  private Long id;
  private String firstName;
  private String lastName;
  private Country countryId;
  private String email;
  private int age;

}

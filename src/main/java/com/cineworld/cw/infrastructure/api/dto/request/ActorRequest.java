package com.cineworld.cw.infrastructure.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorRequest {

  private Long id;
  private String firstName;
  private String lastName;
  private Long countryId;
  private String email;
  private int age;

}

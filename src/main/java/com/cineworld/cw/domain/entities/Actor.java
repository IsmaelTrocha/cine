package com.cineworld.cw.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

  private Long id;
  private String firstName;
  private String lastName;
  private Country countryId;
  private String email;
  private int age;

}

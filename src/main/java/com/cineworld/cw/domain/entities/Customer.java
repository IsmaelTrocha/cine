package com.cineworld.cw.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  private Long id;
  private String firstName;
  private String secondName;
  private String firstSurname;
  private String secondSurname;
  private String email;
  private Address address;
  private boolean active;
  private String lastUpdate;
}

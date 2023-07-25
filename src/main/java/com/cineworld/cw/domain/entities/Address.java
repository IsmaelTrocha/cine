package com.cineworld.cw.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
  private Long id;
  private String address;
  private City cityId;
  private String postalCode;
  private String lastUpdate;
}

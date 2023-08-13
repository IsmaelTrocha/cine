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
  private String street;
  private String avenue;
  private City cityId;
  private String postalCode;
  private String lastUpdate;
  private Customer customer;
}

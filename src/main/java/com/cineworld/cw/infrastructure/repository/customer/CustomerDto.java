package com.cineworld.cw.infrastructure.repository.customer;

import com.cineworld.cw.infrastructure.repository.address.AddressDto;

public class CustomerDto {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private AddressDto addressId;
  private boolean active;
  private String lastUpdate;
}

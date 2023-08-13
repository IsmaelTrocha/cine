package com.cineworld.cw.infrastructure.api.dto.response;

import com.cineworld.cw.domain.entities.Address;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerResponse {
  private Long id;
  private String firstName;
  private String secondName;
  private String firstSurname;
  private String secondSurname;
  private String email;
  private List<AddressResponse> address;
  private boolean active;
}

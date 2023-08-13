package com.cineworld.cw.infrastructure.repository.address;

import com.cineworld.cw.infrastructure.repository.city.CityDto;
import com.cineworld.cw.infrastructure.repository.customer.CustomerDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class AddressDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String address;
  private String street;
  private String avenue;
  @ManyToOne
  @JoinColumn(name = "customer_id", referencedColumnName = "id")
  private CustomerDto customer;
  @ManyToOne
  @JoinColumn(name = "city_id", referencedColumnName = "id")
  private CityDto cityId;
  @Column(name = "postal_code")
  private String postalCode;
  @Column(name = "last_update")
  private String lastUpdate;
}

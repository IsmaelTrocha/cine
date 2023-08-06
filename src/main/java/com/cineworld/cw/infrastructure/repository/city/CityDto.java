package com.cineworld.cw.infrastructure.repository.city;

import com.cineworld.cw.domain.entities.Country;
import com.cineworld.cw.infrastructure.repository.country.CountryDto;
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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CITY")
public class CityDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @ManyToOne
  @JoinColumn(name = "country_id", referencedColumnName = "id")
  private CountryDto countryId;
}

package com.cineworld.cw.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

  private Long id;
  private String tittle;
  private String description;
  private int releaseYear;
  private Language filmLanguage;
  private Language originalLanguage;
  private int rentalDuration;
  private double replacementCost;
}

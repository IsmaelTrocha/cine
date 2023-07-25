package com.cineworld.cw.infrastructure.repository.film;

import com.cineworld.cw.infrastructure.repository.language.LanguageDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto {

  private Long id;
  private String tittle;
  private String description;
  private int releaseYear;
  private LanguageDto filmLanguage;
  private LanguageDto originalLanguage;
  private int rentalDuration;
  private double replacementCost;

}

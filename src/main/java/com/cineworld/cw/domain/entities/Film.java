package com.cineworld.cw.domain.entities;

import java.util.List;
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
  private List<Category> categories;
  private Language filmLanguage;
  private Language originalLanguage;

}

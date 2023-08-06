package com.cineworld.cw.infrastructure.api.dto.response;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.domain.entities.Language;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmResponse {

  private Long id;
  private String tittle;
  private String description;
  private int releaseYear;
  private List<Category> categories;
  private Language filmLanguage;
  private Language originalLanguage;

}

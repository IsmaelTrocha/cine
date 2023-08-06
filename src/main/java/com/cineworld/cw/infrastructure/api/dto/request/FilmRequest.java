package com.cineworld.cw.infrastructure.api.dto.request;

import com.cineworld.cw.domain.entities.Category;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmRequest {

  private String tittle;
  private String description;
  private int releaseYear;
  private List<Category> categories;
}

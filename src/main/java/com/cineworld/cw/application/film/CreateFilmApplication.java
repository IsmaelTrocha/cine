package com.cineworld.cw.application.film;

import com.cineworld.cw.application.category.GetCategoryApplication;
import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.domain.services.film.CreateFilmService;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateFilmApplication {

  private final CreateFilmService createFilmService;
  private final GetCategoryApplication getCategoryApplication;


  public Film createFilm(Film film) {

    for (Category category : film.getCategories()) {
      List<Category> categories = Arrays.asList(getCategoryApplication.getById(category.getId()));
      film.setCategories(categories);
    }
    return createFilmService.save(film);
  }
}

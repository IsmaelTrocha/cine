package com.cineworld.cw.application.film;

import com.cineworld.cw.application.category.GetCategoryApplication;
import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.domain.services.film.CreateFilmService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateFilmApplication {

  private final CreateFilmService createFilmService;
  private final GetCategoryApplication getCategoryApplication;


  public Film createFilm(Film film){

    return createFilmService.save(film);
  }
}

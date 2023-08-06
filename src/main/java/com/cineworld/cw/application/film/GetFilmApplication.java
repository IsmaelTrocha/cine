package com.cineworld.cw.application.film;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.domain.services.film.GetFilmService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetFilmApplication {

  private final GetFilmService getFilmService;

  public Film findById(Long id){
    return getFilmService.getById(id);
  }


}

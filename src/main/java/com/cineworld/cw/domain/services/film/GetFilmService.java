package com.cineworld.cw.domain.services.film;

import com.cineworld.cw.domain.entities.Film;
import java.util.List;

public interface GetFilmService {

  List<Film> findAll();
  Film getById(Long id);

}

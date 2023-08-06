package com.cineworld.cw.infrastructure.adapter.film;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.domain.services.film.CreateFilmService;
import com.cineworld.cw.infrastructure.mapper.FilmDtoMapper;
import com.cineworld.cw.infrastructure.repository.film.FilmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateFilmAdapter implements CreateFilmService {

  private final FilmRepository filmRepository;
  private final FilmDtoMapper filmDtoMapper;

  @Override
  public Film save(Film film) {
    return filmDtoMapper.toEntity(filmRepository.save(filmDtoMapper.toDto(film)));
  }
}

package com.cineworld.cw.infrastructure.adapter.film;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.domain.services.film.GetFilmService;
import com.cineworld.cw.infrastructure.mapper.FilmDtoMapper;
import com.cineworld.cw.infrastructure.repository.film.FilmRepository;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import com.cineworld.cw.shared.messages.film.FilmNotFoundException;
import com.cineworld.cw.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetFilmAdapter implements GetFilmService {

  private final FilmRepository filmRepository;
  private final FilmDtoMapper filmDtoMapper;
  private final MessageUtils messageUtils;

  @Override
  public List<Film> findAll() {
    return filmDtoMapper.toEntity(filmRepository.findAll());
  }

  @Override
  public Film getById(Long id) {
    return filmDtoMapper.toEntity(filmRepository.findById(id)
        .orElseThrow(() -> new FilmNotFoundException(messageUtils.getMessage(
            ExceptionCode.MOVIE_NOT_FOUND.getType(), id.toString()))));
  }
}

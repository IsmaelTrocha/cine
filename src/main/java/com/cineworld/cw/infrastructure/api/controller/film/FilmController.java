package com.cineworld.cw.infrastructure.api.controller.film;

import static com.cineworld.cw.shared.utils.CustomHeader.X_AUTH_EMAIL;

import com.cineworld.cw.application.film.CreateFilmApplication;
import com.cineworld.cw.application.film.GetFilmApplication;
import com.cineworld.cw.infrastructure.api.dto.request.FilmRequest;
import com.cineworld.cw.infrastructure.api.dto.response.CreateResponse;
import com.cineworld.cw.infrastructure.api.dto.response.FilmResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.FilmRequestMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.FilmResponseMapper;
import com.cineworld.cw.shared.exception.code.MessageCode;
import com.cineworld.cw.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/film")
@AllArgsConstructor
public class FilmController {

  private final CreateFilmApplication createFilmApplication;
  private final GetFilmApplication getFilmApplication;
  private final FilmRequestMapper filmRequestMapper;
  private final FilmResponseMapper filmResponseMapper;
  private final MessageUtils messageUtils;
  @PostMapping
  public ResponseEntity<CreateResponse> createFilm(@RequestBody FilmRequest filmRequest,
      @RequestHeader(X_AUTH_EMAIL) String createAt) {

    createFilmApplication.createFilm(filmRequestMapper.toEntity(filmRequest));
    return new ResponseEntity<>(
        new CreateResponse(
            messageUtils.getMessage(MessageCode.FILM_SAVE_SUCCESSFUL.getCode()),
            messageUtils.getMessage(MessageCode.FILM_SAVE_SUCCESSFUL.getType()),
            messageUtils.getMessage(MessageCode.FILM_SAVE_SUCCESSFUL.getType())),
        HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<FilmResponse> findById(@PathVariable Long id) {
    return new ResponseEntity<>(filmResponseMapper.toDto(getFilmApplication.findById(id)),
        HttpStatus.OK);
  }

}

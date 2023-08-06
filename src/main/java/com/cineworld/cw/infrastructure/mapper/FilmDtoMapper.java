package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.infrastructure.repository.film.FilmDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface FilmDtoMapper extends EntityToDto<FilmDto, Film> {

}

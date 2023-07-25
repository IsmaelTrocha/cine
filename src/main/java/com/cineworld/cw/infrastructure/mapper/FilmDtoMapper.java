package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.infrastructure.repository.film.FilmDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    LanguageDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FilmDtoMapper extends EntityToDto<FilmDto, Film> {

}

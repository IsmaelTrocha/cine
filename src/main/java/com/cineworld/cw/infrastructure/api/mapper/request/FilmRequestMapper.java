package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.infrastructure.api.dto.request.FilmRequest;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CategoryRequestMapper.class,
    LanguageRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FilmRequestMapper extends EntityToDto<FilmRequest, Film> {

  Film toEntity(FilmRequest filmRequest);

}

package com.cineworld.cw.infrastructure.api.mapper.response;

import com.cineworld.cw.domain.entities.Film;
import com.cineworld.cw.infrastructure.api.dto.response.FilmResponse;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface FilmResponseMapper extends EntityToDto<FilmResponse, Film> {


  Film toEntity(FilmResponse filmResponse);
}

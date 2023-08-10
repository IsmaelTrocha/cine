package com.cineworld.cw.infrastructure.api.mapper.response;

import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.infrastructure.api.dto.response.ActorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ActorResponseMapper {


  ActorResponse toResponse(Actor actor);

}

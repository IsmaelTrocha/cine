package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.infrastructure.repository.actor.ActorDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ActorDtoMapper extends EntityToDto<ActorDto, Actor> {

}

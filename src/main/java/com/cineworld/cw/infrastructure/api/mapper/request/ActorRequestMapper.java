package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.infrastructure.api.dto.request.ActorRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CountryRequestMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ActorRequestMapper {

  @Mapping(source = "countryId", target = "countryId.id")
  Actor toEntity(ActorRequest actorRequest);
}

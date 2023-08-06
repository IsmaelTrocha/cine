package com.cineworld.cw.infrastructure.adapter.actor;

import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.domain.services.actor.CreateActorService;
import com.cineworld.cw.infrastructure.mapper.ActorDtoMapper;
import com.cineworld.cw.infrastructure.repository.actor.ActorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateActorAdapter implements CreateActorService {

  private final ActorRepository actorRepository;
  private final ActorDtoMapper actorDtoMapper;

  @Override
  public Actor create(Actor actor) {
    return actorDtoMapper.toEntity(actorRepository.save(actorDtoMapper.toDto(actor)));
  }
}

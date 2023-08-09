package com.cineworld.cw.infrastructure.adapter.actor;

import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.domain.services.actor.GetActorService;
import com.cineworld.cw.infrastructure.mapper.ActorDtoMapper;
import com.cineworld.cw.infrastructure.repository.actor.ActorRepository;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import com.cineworld.cw.shared.messages.actor.ActorNotFoundException;
import com.cineworld.cw.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetActorAdapter implements GetActorService {

  private final ActorRepository actorRepository;
  private final ActorDtoMapper actorDtoMapper;
  private final MessageUtils messageUtils;

  @Override
  public Actor findById(Long id) {
    return actorDtoMapper.toEntity(actorRepository.findById(id)
        .orElseThrow(() -> new ActorNotFoundException(
            messageUtils.getMessage(ExceptionCode.ACTOR_NOT_FOUND.getType(), id.toString()))));
  }

  @Override
  public List<Actor> findAll() {
    return null;
  }
}

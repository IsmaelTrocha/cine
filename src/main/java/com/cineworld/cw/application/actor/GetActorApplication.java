package com.cineworld.cw.application.actor;

import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.domain.services.actor.GetActorService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetActorApplication {

  private final GetActorService getActorService;

  public Actor findById(Long id) {
    return getActorService.findById(id);
  }

  public List<Actor> findAll(){
    return getActorService.findAll();
  }
}

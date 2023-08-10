package com.cineworld.cw.application.actor;

import com.cineworld.cw.application.country.GetCountryApplication;
import com.cineworld.cw.domain.entities.Actor;
import com.cineworld.cw.domain.services.actor.CreateActorService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateActorApplication {

  private final CreateActorService createActorService;
  private final GetCountryApplication getCountryApplication;

  public Actor createActor(Actor actor) {
    actor.setCountryId(getCountryApplication.findById(actor.getCountryId().getId()));
    return createActorService.create(actor);
  }

}

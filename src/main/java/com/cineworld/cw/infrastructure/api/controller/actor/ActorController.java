package com.cineworld.cw.infrastructure.api.controller.actor;

import com.cineworld.cw.application.actor.CreateActorApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/actor")
@AllArgsConstructor
public class ActorController {

  private final CreateActorApplication createActorApplication;

}

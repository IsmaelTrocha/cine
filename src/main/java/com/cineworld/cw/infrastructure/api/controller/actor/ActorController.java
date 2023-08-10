package com.cineworld.cw.infrastructure.api.controller.actor;

import static com.cineworld.cw.shared.utils.CustomHeader.X_AUTH_EMAIL;

import com.cineworld.cw.application.actor.CreateActorApplication;
import com.cineworld.cw.infrastructure.api.dto.request.ActorRequest;
import com.cineworld.cw.infrastructure.api.dto.response.CreateResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.ActorRequestMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.ActorResponseMapper;
import com.cineworld.cw.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/actor")
@AllArgsConstructor
public class ActorController {

  private final CreateActorApplication createActorApplication;
  private final ActorRequestMapper actorRequestMapper;
  private final ActorResponseMapper actorResponseMapper;
  private final MessageUtils messageUtils;

  public ResponseEntity<CreateResponse> createActor(@RequestBody ActorRequest actorRequest,
      @RequestHeader(X_AUTH_EMAIL) String createAt) {
    createActorApplication.createActor(actorRequestMapper.toEntity(actorRequest));
    return new ResponseEntity<>(new CreateResponse("", "", ""), HttpStatus.OK);
  }
}

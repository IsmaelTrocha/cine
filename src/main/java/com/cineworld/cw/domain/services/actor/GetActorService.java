package com.cineworld.cw.domain.services.actor;

import com.cineworld.cw.domain.entities.Actor;
import java.util.List;

public interface GetActorService {

  Actor findById(Long id);

  List<Actor> findAll();

}

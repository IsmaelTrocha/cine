package com.cineworld.cw.domain.services.language;

import com.cineworld.cw.domain.entities.Language;
import java.util.List;

public interface GetLanguageService {

  List<Language> findAll();

}

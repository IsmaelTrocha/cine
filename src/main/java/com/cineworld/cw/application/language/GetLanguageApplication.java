package com.cineworld.cw.application.language;

import com.cineworld.cw.domain.entities.Language;
import com.cineworld.cw.domain.services.language.GetLanguageService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetLanguageApplication {

  private final GetLanguageService getLanguageService;

  public List<Language> getAllLanguages(){
    return getLanguageService.findAll();
  }
}

package com.cineworld.cw.application;

import com.cineworld.cw.application.category.GetCategoryApplication;
import com.cineworld.cw.application.film.CreateFilmApplication;
import com.cineworld.cw.domain.services.category.GetCategoryService;
import com.cineworld.cw.domain.services.film.CreateFilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


  @Bean
  public GetCategoryApplication getCategoryApplication(GetCategoryService getCategoryService) {
    return new GetCategoryApplication(getCategoryService);
  }

  @Bean
  public CreateFilmApplication createFilmApplication(CreateFilmService createFilmService,
      GetCategoryApplication categoryApplication) {
    return new CreateFilmApplication(createFilmService, categoryApplication);
  }

}

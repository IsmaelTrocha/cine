package com.cineworld.cw.application.category;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.domain.services.category.GetCategoryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCategoryApplication {

  private final GetCategoryService getCategoryService;


  public Category getById(Long id) {
    return getCategoryService.getById(id);
  }

}

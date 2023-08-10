package com.cineworld.cw.application.category;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.domain.services.category.CreateCategoryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCategoryApplication {

  private final CreateCategoryService createCategoryService;

  public Category createCategory(Category category) {
    return createCategoryService.save(category);
  }
}

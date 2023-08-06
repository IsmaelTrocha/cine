package com.cineworld.cw.infrastructure.adapter.category;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.domain.services.category.CreateCategoryService;
import com.cineworld.cw.infrastructure.mapper.CategoryDtoMapper;
import com.cineworld.cw.infrastructure.repository.category.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateCategoryAdapter implements CreateCategoryService {

  private final CategoryRepository categoryRepository;
  private final CategoryDtoMapper categoryDtoMapper;

  @Override
  public Category save(Category category) {
    return categoryDtoMapper.toEntity(categoryRepository.save(categoryDtoMapper.toDto(category)));
  }
}

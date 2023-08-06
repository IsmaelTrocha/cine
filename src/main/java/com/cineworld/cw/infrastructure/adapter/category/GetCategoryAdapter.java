package com.cineworld.cw.infrastructure.adapter.category;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.domain.services.category.GetCategoryService;
import com.cineworld.cw.infrastructure.mapper.CategoryDtoMapper;
import com.cineworld.cw.infrastructure.repository.category.CategoryRepository;
import com.cineworld.cw.shared.exception.code.ExceptionCode;
import com.cineworld.cw.shared.messages.category.CategoryNotFoundException;
import com.cineworld.cw.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetCategoryAdapter implements GetCategoryService {

  private final CategoryRepository categoryRepository;
  private final CategoryDtoMapper categoryDtoMapper;
  private final MessageUtils messageUtils;

  @Override
  public Category getById(Long id) {
    return categoryDtoMapper.toEntity(
        categoryRepository.findById(id)
            .orElseThrow(() -> new CategoryNotFoundException(messageUtils.getMessage(
                ExceptionCode.CATEGORY_NOT_FOUND.getType(), id.toString()))));
  }

  @Override
  public List<Category> getAllCategories() {
    return null;
  }

  @Override
  public List<Category> getCategoriesById(List<Category> categories) {
    return null;
  }
}

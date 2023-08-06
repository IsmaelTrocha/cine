package com.cineworld.cw.infrastructure.api.controller.category;

import com.cineworld.cw.application.category.GetCategoryApplication;
import com.cineworld.cw.infrastructure.api.dto.response.CategoryResponse;
import com.cineworld.cw.infrastructure.api.mapper.request.CategoryRequestAlterMapper;
import com.cineworld.cw.infrastructure.api.mapper.response.CategoryResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/category")
public class CategoryController {

  private final GetCategoryApplication categoryApplication;
  private final CategoryRequestAlterMapper categoryRequestAlterMapper;
  private final CategoryResponseMapper categoryResponseMapper;

  @GetMapping("/{id}")
  public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable("id") Long id) {
    return new ResponseEntity<>(categoryResponseMapper.toDto(categoryApplication.getById(id)),
        HttpStatus.OK);
  }
}

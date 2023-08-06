package com.cineworld.cw.infrastructure.api.mapper.request;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.infrastructure.api.dto.request.CategoryRequestAlter;
import com.cineworld.cw.shared.mapper.EntityToDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryRequestAlterMapper extends EntityToDto<CategoryRequestAlter, Category> {

  @Mapping(source = "category", target = "category.id")
  List<Category> toEntity(List<CategoryRequestAlter> category);
}

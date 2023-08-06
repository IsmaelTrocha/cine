package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.infrastructure.repository.category.CategoryDto;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryDtoMapper extends EntityToDto<CategoryDto, Category> {

}

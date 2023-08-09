package com.cineworld.cw.infrastructure.api.mapper.response;

import com.cineworld.cw.domain.entities.Category;
import com.cineworld.cw.infrastructure.api.dto.response.CategoryResponse;
import com.cineworld.cw.shared.mapper.EntityToDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryResponseMapper extends EntityToDto<CategoryResponse, Category> {


}

package com.cineworld.cw.infrastructure.mapper;

import com.cineworld.cw.domain.entities.Language;
import com.cineworld.cw.infrastructure.api.dto.request.LanguageRequest;
import com.cineworld.cw.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface LanguageDtoMapper extends EntityToDto<LanguageRequest, Language> {

}

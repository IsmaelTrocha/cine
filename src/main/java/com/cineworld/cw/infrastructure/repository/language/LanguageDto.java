package com.cineworld.cw.infrastructure.repository.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto {

  private Long id;
  private String name;
  private String lastUpdate;

}

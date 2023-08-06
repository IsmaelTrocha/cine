package com.cineworld.cw.infrastructure.repository.film;

import com.cineworld.cw.infrastructure.repository.category.CategoryDto;
import com.cineworld.cw.infrastructure.repository.language.LanguageDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "FILM")
public class FilmDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String tittle;
  private String description;
  @Column(name = "release_year")
  private int releaseYear;
  @OneToMany(mappedBy = "films", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<CategoryDto> categories;
  @ManyToOne
  @JoinColumn(name = "film_language", referencedColumnName = "id")
  private LanguageDto filmLanguage;
  @ManyToOne
  @JoinColumn(name = "original_language", referencedColumnName = "id")
  private LanguageDto originalLanguage;
  @Column(name = "rental_duration")
  private int rentalDuration;
  @Column(name = "replacement_cost")
  private double replacementCost;

}

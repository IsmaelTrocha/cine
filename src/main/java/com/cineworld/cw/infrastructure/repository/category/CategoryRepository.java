package com.cineworld.cw.infrastructure.repository.category;

import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryDto, Long> {

  @Query(value = "SELECT C FROM CategoryDto C WHERE C.id = ?1")
  Set<CategoryDto> findCategoryIn(Set<Long> categoriesID);
}

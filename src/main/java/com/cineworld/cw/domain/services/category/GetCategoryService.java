package com.cineworld.cw.domain.services.category;

import com.cineworld.cw.domain.entities.Category;
import java.util.List;

public interface GetCategoryService {

  Category getById(Long id);

  List<Category> getAllCategories();

  List<Category> getCategoriesById(List<Category> categories);


}

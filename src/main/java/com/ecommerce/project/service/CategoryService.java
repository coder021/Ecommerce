package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

//Interface to promote loose coupling
public interface CategoryService {
    List<Category> getALlCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}

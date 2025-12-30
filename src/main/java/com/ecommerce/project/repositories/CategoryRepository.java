package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(@NotBlank(message = "Category can't be blank") @Size(min = 5,message = "Category name must be atleast 5 characters long") String categoryName);
}

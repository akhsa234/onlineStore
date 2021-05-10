package com.bahar.developer.product.repository;

import com.bahar.developer.product.model.Category;
import com.bahar.developer.product.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDbRepository extends JpaRepository<Category, Long> {
}

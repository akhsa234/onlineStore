package com.bahar.developer.product.repository;


import com.bahar.developer.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDbRepository extends JpaRepository<Product, Long> {
    Product findProductById(Long paperIds);

}

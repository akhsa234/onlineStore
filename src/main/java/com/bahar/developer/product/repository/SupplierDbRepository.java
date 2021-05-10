package com.bahar.developer.product.repository;

import com.bahar.developer.product.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDbRepository extends JpaRepository<Supplier,Long> {
}

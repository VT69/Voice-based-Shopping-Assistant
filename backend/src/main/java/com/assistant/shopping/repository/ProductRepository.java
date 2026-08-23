package com.assistant.shopping.repository;

import com.assistant.shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM products p WHERE p.name % :query", nativeQuery = true)
    List<Product> searchBySimilarity(@Param("query") String query);

}

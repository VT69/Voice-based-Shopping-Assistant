package com.assistant.shopping.service;

import com.assistant.shopping.dto.ProductSearchRequest;
import com.assistant.shopping.entity.Product;
import com.assistant.shopping.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductSearchService {

    private final ProductRepository productRepository;

    public ProductSearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> search(ProductSearchRequest request) {
        // TODO: Implement search logic utilizing the pg_trgm native query
        return Collections.emptyList();
    }
}

package com.assistant.shopping.controller;

import com.assistant.shopping.dto.ProductSearchRequest;
import com.assistant.shopping.entity.Product;
import com.assistant.shopping.service.ProductSearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductSearchService productSearchService;

    public ProductController(ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }

    @PostMapping("/search")
    public List<Product> searchProducts(@RequestBody ProductSearchRequest request) {
        return productSearchService.search(request);
    }
}

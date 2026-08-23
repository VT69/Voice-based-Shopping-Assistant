package com.assistant.shopping.controller;

import com.assistant.shopping.dto.SuggestionResponse;
import com.assistant.shopping.service.RecommendationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionController {

    private final RecommendationService recommendationService;

    public SuggestionController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping
    public SuggestionResponse getSuggestions() {
        // Assuming a hardcoded user ID for now
        Long userId = 1L;
        return recommendationService.getSuggestions(userId);
    }
}

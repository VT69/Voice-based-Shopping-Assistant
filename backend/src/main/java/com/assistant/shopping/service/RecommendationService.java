package com.assistant.shopping.service;

import com.assistant.shopping.dto.SuggestionResponse;
import com.assistant.shopping.recommendation.RecommendationStrategy;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RecommendationService {

    private final List<RecommendationStrategy> strategies;

    public RecommendationService(List<RecommendationStrategy> strategies) {
        this.strategies = strategies;
    }

    public SuggestionResponse getSuggestions(Long userId) {
        // TODO: Implement logic to combine results from all strategies
        return new SuggestionResponse(Collections.emptyList());
    }
}

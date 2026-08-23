package com.assistant.shopping.recommendation;

import com.assistant.shopping.dto.SuggestionResponse.RecommendedItem;
import com.assistant.shopping.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CoOccurrenceStrategy implements RecommendationStrategy {

    private final ProductRepository productRepository;

    public CoOccurrenceStrategy(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<RecommendedItem> recommend(Long userId) {
        // TODO: Implement logic to recommend based on co-occurrence rules.
        // Idea: Lookup co_occurrence_seed based on the user's recent purchases or current cart.
        return Collections.emptyList();
    }
}

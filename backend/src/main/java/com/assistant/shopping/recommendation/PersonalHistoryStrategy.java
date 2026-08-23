package com.assistant.shopping.recommendation;

import com.assistant.shopping.dto.SuggestionResponse.RecommendedItem;
import com.assistant.shopping.repository.PurchaseHistoryRepository;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PersonalHistoryStrategy implements RecommendationStrategy {

    private final PurchaseHistoryRepository purchaseHistoryRepository;

    public PersonalHistoryStrategy(PurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public List<RecommendedItem> recommend(Long userId) {
        // TODO: Implement logic to recommend based on personal purchase history.
        // Idea: Compare days since last purchase against average purchase interval for the user's items.
        return Collections.emptyList();
    }
}

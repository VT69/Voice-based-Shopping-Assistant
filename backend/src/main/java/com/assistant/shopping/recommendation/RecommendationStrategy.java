package com.assistant.shopping.recommendation;

import com.assistant.shopping.dto.SuggestionResponse.RecommendedItem;
import java.util.List;

public interface RecommendationStrategy {
    
    List<RecommendedItem> recommend(Long userId);
    
}

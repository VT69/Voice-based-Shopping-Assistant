package com.assistant.shopping.dto;

import java.util.List;

public class SuggestionResponse {
    
    private List<RecommendedItem> suggestions;
    
    public SuggestionResponse() {
    }

    public SuggestionResponse(List<RecommendedItem> suggestions) {
        this.suggestions = suggestions;
    }

    public List<RecommendedItem> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<RecommendedItem> suggestions) {
        this.suggestions = suggestions;
    }
    
    public static class RecommendedItem {
        private String productName;
        private String reason;
        private Double score;
        
        public RecommendedItem() {
        }
        
        public RecommendedItem(String productName, String reason, Double score) {
            this.productName = productName;
            this.reason = reason;
            this.score = score;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }
    }
}

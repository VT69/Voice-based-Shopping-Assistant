package com.assistant.shopping.dto;

import com.assistant.shopping.entity.ShoppingListItem;
import java.util.List;

public class CommandResponse {
    
    private String intent;
    private String message;
    private List<ShoppingListItem> updatedList;
    
    public CommandResponse() {
    }

    public CommandResponse(String intent, String message, List<ShoppingListItem> updatedList) {
        this.intent = intent;
        this.message = message;
        this.updatedList = updatedList;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ShoppingListItem> getUpdatedList() {
        return updatedList;
    }

    public void setUpdatedList(List<ShoppingListItem> updatedList) {
        this.updatedList = updatedList;
    }
}

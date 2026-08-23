package com.assistant.shopping.service;

import com.assistant.shopping.entity.ShoppingListItem;
import com.assistant.shopping.repository.ShoppingListItemRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ShoppingListService {

    private final ShoppingListItemRepository repository;

    public ShoppingListService(ShoppingListItemRepository repository) {
        this.repository = repository;
    }

    public List<ShoppingListItem> getShoppingList(Long userId) {
        // TODO: Implement getting shopping list for a user
        return Collections.emptyList();
    }

    public void removeShoppingListItem(Long id) {
        // TODO: Implement removing item from shopping list
    }
}

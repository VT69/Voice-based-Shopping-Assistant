package com.assistant.shopping.controller;

import com.assistant.shopping.entity.ShoppingListItem;
import com.assistant.shopping.service.ShoppingListService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shopping-list")
public class ShoppingListController {

    private final ShoppingListService shoppingListService;

    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @GetMapping
    public List<ShoppingListItem> getShoppingList() {
        // Assuming a hardcoded user ID for now as there's no auth setup in scaffolding
        Long userId = 1L; 
        return shoppingListService.getShoppingList(userId);
    }

    @DeleteMapping("/{id}")
    public void removeShoppingListItem(@PathVariable Long id) {
        shoppingListService.removeShoppingListItem(id);
    }
}

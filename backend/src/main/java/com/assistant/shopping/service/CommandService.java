package com.assistant.shopping.service;

import com.assistant.shopping.ai.CommandIntent;
import com.assistant.shopping.ai.IntentParser;
import com.assistant.shopping.dto.CommandRequest;
import com.assistant.shopping.dto.CommandResponse;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CommandService {

    private final IntentParser intentParser;
    private final ShoppingListService shoppingListService;
    private final ProductSearchService productSearchService;

    public CommandService(IntentParser intentParser, ShoppingListService shoppingListService, ProductSearchService productSearchService) {
        this.intentParser = intentParser;
        this.shoppingListService = shoppingListService;
        this.productSearchService = productSearchService;
    }

    public CommandResponse handle(CommandRequest request) {
        CommandIntent intent = intentParser.parse(request.getText());
        
        // TODO: Implement routing logic based on the intent
        switch (intent.getIntent()) {
            case ADD_ITEM:
                // TODO: Call shoppingListService.addItem()
                break;
            case REMOVE_ITEM:
                // TODO: Call shoppingListService.removeItem()
                break;
            case UPDATE_QUANTITY:
                // TODO: Call shoppingListService.updateQuantity()
                break;
            case SEARCH_PRODUCT:
                // TODO: Call productSearchService.search()
                break;
            case SHOW_LIST:
                // TODO: Call shoppingListService.getList()
                break;
            case UNKNOWN:
            default:
                // TODO: Handle unknown intent
                break;
        }

        return new CommandResponse(intent.getIntent().name(), "Command processed", Collections.emptyList());
    }
}

package com.assistant.shopping.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class IntentParser {

    private final ChatClient chatClient;

    public IntentParser(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public CommandIntent parse(String transcript) {
        // TODO: Build prompt instructing the model to return only CommandIntent-shaped JSON
        // Example: "Parse the following transcript into a CommandIntent JSON object, identifying the intent, product details, quantity, and price constraints."
        
        return chatClient.prompt()
                .user(transcript)
                // .system(...) // TODO: Add system prompt here
                .call()
                .entity(CommandIntent.class);
    }
}

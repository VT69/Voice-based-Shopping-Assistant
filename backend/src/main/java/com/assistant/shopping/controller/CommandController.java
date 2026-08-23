package com.assistant.shopping.controller;

import com.assistant.shopping.dto.CommandRequest;
import com.assistant.shopping.dto.CommandResponse;
import com.assistant.shopping.service.CommandService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/commands")
public class CommandController {

    private final CommandService commandService;

    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    @PostMapping
    public CommandResponse handleCommand(@RequestBody CommandRequest request) {
        return commandService.handle(request);
    }
}

package com.example.bendingrobot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody MessageRequest request) {
        return ResponseEntity.ok("Bending robot received: " + request.getMessage());
    }
}

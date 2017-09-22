package com.github.aldwindelgado;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Value("${message: Default message only")
    private String message;

    @GetMapping("/rest/message")
    public String getMessage() {
        return message;
    }
}

package com.codelib.basicauthauthz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class GreetingRestController {

    @GetMapping(path = "/greeting")
    public String greeting() {
        return "hello from rest controller!";
    }
}

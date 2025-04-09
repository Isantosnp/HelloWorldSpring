package com.seuprojeto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController public class HelloController {
    @GetMapping("/teste")
    public String helloWorld() {
        return "Hello World";
    }
        
}
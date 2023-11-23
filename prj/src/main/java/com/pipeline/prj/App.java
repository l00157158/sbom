package com.pipeline.prj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!! My Name is Jimmy; This is a Pipeline demo Ver 0.2 ";
    }
}

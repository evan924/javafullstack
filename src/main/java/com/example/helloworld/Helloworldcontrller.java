package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontrller {

    @GetMapping("/asdf")
    public String helloworld() {
        return "hello world111";
    }
}

package org.exemple.springbootboilerplate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api/test")
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}

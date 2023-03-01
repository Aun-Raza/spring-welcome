package com.aunraza.welcomepage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/")
    String welcome() {
        return "<h1>Welcome to COMP367</h1>";
    }
}

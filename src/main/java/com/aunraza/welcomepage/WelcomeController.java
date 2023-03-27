package com.aunraza.welcomepage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/")
    String welcome() {
//        int hour = LocalTime.now().getHour();
//        if (hour >= 6 && hour < 12) {
//            return "<h1>Good Morning, Aun, Welcome to COMP367</h1>";
//        }
//        else {
//            return "<h1>Good Afternoon, Aun, Welcome to COMP367</h1>";
//        }
        return "<h1>Good Morning, Aun, Welcome to COMP367</h1>";
    }
}

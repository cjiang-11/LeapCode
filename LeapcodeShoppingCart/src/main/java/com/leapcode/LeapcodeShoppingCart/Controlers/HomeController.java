package com.leapcode.LeapcodeShoppingCart.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/someRandomPage")
    public String home(){
        System.out.println("test");
        return "home";
    }
}

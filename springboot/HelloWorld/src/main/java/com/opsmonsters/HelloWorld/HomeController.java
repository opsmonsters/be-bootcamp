package com.opsmonsters.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public User index(){
        User user = new User();
        user.userId = 20;
        user.lastLogin = "2 Days ago";
        user.password = "password";
        user.username = "Gershon";

        return user;
    }

}

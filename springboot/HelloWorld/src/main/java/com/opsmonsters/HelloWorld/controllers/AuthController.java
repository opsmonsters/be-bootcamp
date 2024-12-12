package com.opsmonsters.HelloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
   @GetMapping("/auth/login")
   public String login(){
       return "You Are logged in";
   }
}

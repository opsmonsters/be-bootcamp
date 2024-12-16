package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dto.LoginDto;
import com.opsmonsters.HelloWorld.dto.ResponseDto;
import com.opsmonsters.HelloWorld.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

   @PostMapping("/auth/login")
   public ResponseEntity<ResponseDto> login(@RequestBody LoginDto dto){
       ResponseDto response = authService.userLogin(dto);
       return new ResponseEntity<>(response, HttpStatusCode.valueOf(response.statusCode));
   }
}

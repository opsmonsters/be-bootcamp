package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dao.UserDao;
import com.opsmonsters.HelloWorld.dto.UserDto;
import com.opsmonsters.HelloWorld.models.User;
import com.opsmonsters.HelloWorld.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserDao userDao;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/auth/signup")
    public String createUser(@RequestBody UserDto dto){
        User user = new User();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setAddress(dto.getAddress());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setGender(dto.getGender());

        userRepo.save(user);

        return "User " + dto.getFirstName() + "Created";

    }

    @GetMapping("/users/{userId}") // 1
    public UserDto getUserById(@PathVariable int userId){
        UserDto user = userDao.getUserById(userId);
        return user;
    }

}

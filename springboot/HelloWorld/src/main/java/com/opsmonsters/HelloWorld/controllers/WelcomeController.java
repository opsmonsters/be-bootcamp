package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dto.VoteEligibleRequestDto;
import com.opsmonsters.HelloWorld.dto.VoteEligibleResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to my spring app";
    }

    @GetMapping("/test-json")
    public VoteEligibleResponseDto testJson(@RequestParam("name")String name, @RequestParam("ageOfPerson") int age){
        VoteEligibleResponseDto voteEligibleResponseDto = new VoteEligibleResponseDto();
        voteEligibleResponseDto.name = name;
        voteEligibleResponseDto.age = age;
        if(age > 18){
            voteEligibleResponseDto.canVote = true;
        }else {
            voteEligibleResponseDto.canVote = false;
        }
        return voteEligibleResponseDto;
    }

    @GetMapping("/users/{userId}")
    public int getUserId(@PathVariable int userId){
       return userId;
    }


    @PostMapping("/test-json")
    public VoteEligibleResponseDto testJsonPost(@RequestBody VoteEligibleRequestDto requestDto){
        VoteEligibleResponseDto responseDto = new VoteEligibleResponseDto();
        responseDto.name = requestDto.name;
        responseDto.age = requestDto.age;
        if(requestDto.age > 18){
            responseDto.canVote = true;
        }else{
            responseDto.canVote = false;
        }
        return responseDto;
    }

    @PutMapping("/test-json")
    public VoteEligibleResponseDto testJsonPut(){
        VoteEligibleResponseDto voteEligibleResponseDto = new VoteEligibleResponseDto();
        voteEligibleResponseDto.name = "Gershon Put";
        voteEligibleResponseDto.age = 26;
        voteEligibleResponseDto.canVote = true;
        return voteEligibleResponseDto;
    }

    @DeleteMapping("/test-json")
    public VoteEligibleResponseDto testJsonDelete(){
        VoteEligibleResponseDto voteEligibleResponseDto = new VoteEligibleResponseDto();
        voteEligibleResponseDto.name = "Gershon Delete";
        voteEligibleResponseDto.age = 26;
        voteEligibleResponseDto.canVote = true;
        return voteEligibleResponseDto;
    }
}

package com.opsmonsters.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to my spring app";
    }

    @GetMapping("/test-json")
    public TestJson testJson(@RequestParam("name")String name, @RequestParam("ageOfPerson") int age){
        TestJson testJson = new TestJson();
        testJson.name = name;
        testJson.age = age;
        if(age > 18){
            testJson.canVote = true;
        }else {
            testJson.canVote = false;
        }
        return testJson;
    }

    @PostMapping("/test-json")
    public TestJson testJsonPost(){
        TestJson testJson = new TestJson();
        testJson.name = "Gershon Post";
        testJson.age = 26;
        testJson.canVote = true;
        return testJson;
    }

    @PutMapping("/test-json")
    public TestJson testJsonPut(){
        TestJson testJson = new TestJson();
        testJson.name = "Gershon Put";
        testJson.age = 26;
        testJson.canVote = true;
        return testJson;
    }

    @DeleteMapping("/test-json")
    public TestJson testJsonDelete(){
        TestJson testJson = new TestJson();
        testJson.name = "Gershon Delete";
        testJson.age = 26;
        testJson.canVote = true;
        return testJson;
    }
}

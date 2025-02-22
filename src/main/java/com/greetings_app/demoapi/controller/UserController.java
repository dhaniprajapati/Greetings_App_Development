package com.greetings_app.demoapi.controller;

import com.greetings_app.demoapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// Base path for all
@RequestMapping("/api")
public class UserController {

    //UC_1- Using different HTTP methods
    //GET
    // curl -X GET http://localhost:8080/api/greet
    @GetMapping("/greet")
    public String sayHello(){
        return "{\"message\" : \"Hello World.\"";
    }
    //POST
    //curl -X POST http://localhost:8080/api/post
    @PostMapping("/post")
    public String sayHelloPost(){
        return "{\"message\" : \"Hello World. Greeting posted.\"";
    }
    //PUT
    //curl -X PUT http://localhost:8080/api/put
    @PutMapping("/put")
    public String sayHelloPut(){
        return "{\"message\" : \"Hello World. Greeting updated.\"";
    }
    //PATCH
    //curl -X PATCH http://localhost:8080/api/patch
    @PatchMapping("/patch")
    public String sayHelloPatch(){
        return "{\"message\" : \"Hello World. Partally.\"";
    }
    //DELETE
    //curl -X DELETE http://localhost:8080/api/delete
    @DeleteMapping("/delete")
    public String sayHelloDelete(){
        return "{\"message\" : \"Greeting deleted.\"";
    }

    //UC_2- to return a simple greeting message
    // curl -X GET http://localhost:8080/api/greet
    @Autowired
    //automatically injects the UserService bean into this controller
    private UserService userService;
    // Constructor-based Dependency Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/greeting")
    //calls the getGreetingMessage method from UserService to get the greeting message
    public String sayHelloGet() {
        return UserService.getGreetingMessage();
    }
}
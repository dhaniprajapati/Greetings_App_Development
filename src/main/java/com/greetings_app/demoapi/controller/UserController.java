package com.greetings_app.demoapi.controller;

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
        return "Hello World.";
    }
    //POST
    //curl -X POST http://localhost:8080/api/post
    @PostMapping("/post")
    public String sayHelloPost(){
        return "Hello World. Greeting posted.";
    }
    //PUT
    //curl -X PUT http://localhost:8080/api/put
    @PutMapping("/put")
    public String sayHelloPut(){
        return "Hello WorlD. Greeting updated.";
    }
    //PATCH
    //curl -X PATCH http://localhost:8080/api/patch
    @PatchMapping("/patch")
    public String sayHelloPatch(){
        return "Hello. Partially updated";
    }
    //DELETE
    //curl -X DELETE http://localhost:8080/api/delete
    @DeleteMapping("/delete")
    public String sayHelloDelete(){
        return "Greeting deleted";
    }
}
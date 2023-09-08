package com.anubhav.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Controller {

    @GetMapping("/")
    public Object getAllUsers(){
        return "ok";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String  id){
        return id;
    }

    @PostMapping("/")
    public String addUser(@RequestBody String userId){
        return userId;
    }
}

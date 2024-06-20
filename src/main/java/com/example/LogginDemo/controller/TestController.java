package com.example.LogginDemo.controller;


import jakarta.annotation.security.DenyAll;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class TestController {

@PostMapping("/post")
    public String helloPost(){
        return "Buen dia POST";
    }
    @GetMapping("/get")
    public String helloGet(){
        return "Buen dia Get";
    }
    @PutMapping("/put")
    public String helloPut(){
        return "Buen dia Put";
    }
    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Buen dia Delete";
    }
}

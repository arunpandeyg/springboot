package com.sb.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DepartmentController {
    @GetMapping("/")
    public String helloController(){
        return "hello";
    }
}

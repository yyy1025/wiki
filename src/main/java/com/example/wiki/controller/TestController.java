package com.example.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @RequestMapping("/hello")
//    等价注解
    @GetMapping(value = "/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    private String sayHello(){
        return "hello yyy";

    }
}

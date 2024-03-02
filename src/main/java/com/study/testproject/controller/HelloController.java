package com.study.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(value="/hello", method = RequestMethod.POST)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
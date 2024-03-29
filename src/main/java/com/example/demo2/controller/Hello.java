package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello, SpringBoot With Docker";
    }
}
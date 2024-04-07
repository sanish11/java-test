package com.example.try2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
public String homePage(){
    return "home";
}
@RequestMapping("/dash")
    public String Dashboard(){
        return "dash";
    }
}

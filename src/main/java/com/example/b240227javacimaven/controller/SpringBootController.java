package com.example.b240227javacimaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SpringBootController {


    @GetMapping("")
    public String sayWelcome() {


        return "welcome";
    }




}

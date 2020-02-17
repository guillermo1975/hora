package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

/*
Maincontroller
*/

@Controller
public class Maincontroller {


    @RequestScope
    @GetMapping("/time")
    @ResponseBody
    public String time() {



        return "data";
    }

}
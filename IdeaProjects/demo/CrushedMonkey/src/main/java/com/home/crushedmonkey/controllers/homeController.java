package com.home.crushedmonkey.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    public String homeController(Model view) {
        return "home";
    }


}

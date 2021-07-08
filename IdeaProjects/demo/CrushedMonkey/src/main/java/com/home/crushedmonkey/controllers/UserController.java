package com.home.crushedmonkey.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @GetMapping("/users/{allusers}")
    public String getAllusers(
            @PathVariable String allusers, Model model)
    {
        model.addAttribute("UsersName", allusers);
        return "users";
    }


    @GetMapping("/signup")
    public String homeController() {
        return "signup";
    }




}

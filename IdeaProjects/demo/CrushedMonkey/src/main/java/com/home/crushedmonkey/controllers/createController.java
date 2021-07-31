package com.home.crushedmonkey.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class createController {



    // User Sign Up

    @GetMapping("users/sign-up.html")
    public String Signup(Model model)
    {
//        model.addAttribute("user", new user());
//        model.addAttribute("fileStackApi", fileStackApi);
        return"users/sign-up";
    }

    @PostMapping("users/sign-up.html")
    public String addANewUser(@RequestParam(name="username") String username,
                              @RequestParam(name="email") String email,
                              @RequestParam(name="password") String password,
                              @RequestParam(name="firstname") String firstname,
                              @RequestParam(name="middleName") String middlename,
                              @RequestParam(name="lastName") String lastName,
                              @RequestParam(name="mobile") long mobilenumber,
                              @RequestParam(name="status") String status,
                              @RequestParam(name="profile") String profile,
                              @RequestParam(name="imgPath") String imgPath,
                              @RequestParam(name="originalavatar") String originalavatar


    ){

//        user n = new user();
//        String hash = passwordEncoder.encode(password);
//        n.setPassword(hash);
//        n.setUsername(username);
//        n.setEmail(email);
//        n.setFirstName(firstname);
//        n.setLastName(lastName);
//        n.setMobile(mobilenumber);
//        n.setStatus(status);
//        n.setProfile(profile);
//        n.setImgPath(imgPath);
//        n.setOriginalavatar(originalavatar);
//        usersDao.save(n);
        return "redirect:/home";
    }

}

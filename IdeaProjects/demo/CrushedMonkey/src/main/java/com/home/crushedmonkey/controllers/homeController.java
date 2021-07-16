package com.home.crushedmonkey.controllers;


import com.home.crushedmonkey.repos.BlogRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    private final BlogRepo BlogPostDao;

    public homeController(BlogRepo blogPostDao) {
        BlogPostDao = blogPostDao;
    }

    @GetMapping("/")
    public String homeController(Model view) {
        view.addAttribute("BlogPosts", BlogPostDao.findAll());
        return "home";
    }





    }






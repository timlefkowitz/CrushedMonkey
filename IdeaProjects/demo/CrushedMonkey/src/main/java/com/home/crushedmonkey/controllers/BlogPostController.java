package com.home.crushedmonkey.controllers;


import com.home.crushedmonkey.models.BlogPostmodel;
import com.home.crushedmonkey.repos.BlogRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogPostController {

    private final BlogPostController blogDao;

    public BlogPostController(BlogPostController blogDao){
        this.blogDao = blogDao;
    }



    @GetMapping("/create")
    public String IndexForCreate(){
        return"create";
    }

    @PostMapping("/create")
    public String addNewOrder(@RequestParam(name="email") String email, @RequestParam(name="totalPrice") Double totalPrice){

        BlogPostmodel n = new BlogPostmodel();  //call the model
                                                //Set variables

        orderDao.save(n); //save to Dao
        return "redirect:/show";
    }



}

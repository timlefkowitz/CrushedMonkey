package com.home.crushedmonkey.controllers;



import com.home.crushedmonkey.models.BlogPostmodel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;



@Controller
public class BlogPostController {

    private final BlogPostController blogDao;

    public BlogPostController(BlogPostController blogDao){
        this.blogDao = blogDao;
    }



    @GetMapping("/create")
    public String IndexForCreate(Model viewModel){
        viewModel.addAttribute("blogPost", new BlogPostmodel());
        return"create";
    }

    @PostMapping("/create")
    public String addNewPost (@RequestParam(name="inputTitle") String title,
                              @RequestParam(name="inputDescription") String Description,
                              @RequestParam(name="genre") String genre){

        BlogPostmodel n = new BlogPostmodel();  //call the model && create a new object
        //Set variables
        n.setTitle(title);
        n.setDescription(Description);
        n.setGenre(genre);
        BlogPostmodel dbPost = blogDao.save(n);  //save the object
        return "redirect:/home";
    }



}

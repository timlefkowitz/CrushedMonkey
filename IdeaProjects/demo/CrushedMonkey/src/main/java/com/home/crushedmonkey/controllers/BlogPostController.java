package com.home.crushedmonkey.controllers;


import com.home.crushedmonkey.models.BlogPostmodel;
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
    public String addNewPost (@RequestParam(name="inputTitle") String title,
                              @RequestParam(name="Description") String Description,
                              @RequestParam(name="genre") String genre){

        BlogPostmodel n = new BlogPostmodel();  //call the model
        //Set variables
        n.setTitle(title);
        n.setDescription(Description);
        n.setGenre(genre);
        blogDao.save();
        blogDao.flush();
        return "redirect:/home";
    }



}

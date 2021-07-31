package com.home.crushedmonkey.controllers;



import com.home.crushedmonkey.models.BlogPost;
import com.home.crushedmonkey.repos.BlogRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogPostController {

    private final BlogRepo blogDao;

    public BlogPostController(BlogRepo blogDao) {
        this.blogDao = blogDao;
    }


    @GetMapping("/create")
    public String IndexForCreate(Model viewModel){
        viewModel.addAttribute("blogPost", new BlogPost());
        return"create";
    }

    @PostMapping("/create")
    public String addNewPost (@RequestParam(name="inputTitle") String title,
                              @RequestParam(name="inputDescription") String Description,
                              @RequestParam(name="genre") String genre){

        BlogPost n = new BlogPost();  //call the model && create a new object
        //Set variables
        n.setTitle(title);
        n.setDescription(Description);
        n.setGenre(genre);
        blogDao.save(n);  //save the object
        return "redirect:/";
    }



}

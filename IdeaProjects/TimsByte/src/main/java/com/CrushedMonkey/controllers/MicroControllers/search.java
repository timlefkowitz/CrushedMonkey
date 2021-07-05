package com.CrushedMonkey.controllers.MicroControllers;

import com.CrushedMonkey.repos.post.PostRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class search {


    private PostRepository adsDao;


    @GetMapping("/search")
    public String searchResults(Model model, @RequestParam(name = "term") String term){
        return "ads/index";
    }
}

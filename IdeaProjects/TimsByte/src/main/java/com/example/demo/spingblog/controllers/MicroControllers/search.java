package com.example.demo.spingblog.controllers.MicroControllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class search {
    @GetMapping("/search")
    public String searchResults(Model model, @RequestParam(name = "term") String term){
        return "ads/index";
    }
}

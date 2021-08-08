package com.photonlife.timothylefkowitzcom.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String root(Model model)
    {
        return "index";
    }


    @GetMapping("index")
    public String index(Model model)
    {
        return "index";
    }

    @GetMapping("weathermap")
    public String weathermap(Model model)
    {
        return "weathermap";
    }

    @GetMapping("magazine")
    public String magazine(Model model)
    {
        return "magazine";
    }

}

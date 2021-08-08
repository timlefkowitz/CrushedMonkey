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


    @GetMapping("calc")
    public String calc(Model model)
    {
        return "calc";
    }

    @GetMapping("3d")
    public String threed(Model model)
    {
        return "3d";
    }

    @GetMapping("code")
    public String code(Model model)
    {
        return "code";
    }

    @GetMapping("coffee")
    public String coffee(Model model)
    {
        return "coffee";
    }

    @GetMapping("contact")
    public String contact(Model model)
    {
        return "contact";
    }

    @GetMapping("contactsManager")
    public String contactsManager(Model model)
    {
        return "contactsManager";
    }

    @GetMapping("favfoods")
    public String favfoods(Model model)
    {
        return "favfoods";
    }

    @GetMapping("flickarchive")
    public String flickArchive(Model model)
    {
        return "flickarchive";
    }

    @GetMapping("konami")
    public String magazine(Model model)
    {
        return "konami";
    }

    @GetMapping("mag")
    public String mag(Model model)
    {
        return "mag";
    }

    @GetMapping("min")
    public String min(Model model)
    {
        return "min";
    }

    @GetMapping("NewIndex")
    public String NewIndex(Model model)
    {
        return "NewIndex";
    }




}

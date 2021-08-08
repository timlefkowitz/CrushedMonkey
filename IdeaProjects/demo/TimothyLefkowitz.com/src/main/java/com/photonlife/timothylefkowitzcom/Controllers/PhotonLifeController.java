package com.photonlife.timothylefkowitzcom.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotonLifeController {

    @GetMapping("/")
    public String index(){
        return"NewIndex";


    }
}

package com.example.demo.spingblog.controllers.MicroControllers;

import com.example.demo.spingblog.controllers.ad;
import com.example.demo.spingblog.models.Ad;
import com.example.demo.spingblog.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class create {

    @GetMapping("/ads/create")
    public String showForm(){
        return "ads/create";
    };


    @PostMapping("/ads/create")
    public String save(@RequestParam(value = "title") String title, @RequestParam(value = "description") String description){
        ad.setOwner(user);
        User user = usersDao.getById(1l);
        Ad newAd = new Ad(title, description, user, null);
        Ad savedAd = adsDao.save(newAd);
//        emailService.sendEmail(user.getEmail());
        return "redirect:/ads/" + savedAd.getId();
    }

}

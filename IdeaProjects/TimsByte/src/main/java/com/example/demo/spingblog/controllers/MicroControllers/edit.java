package com.example.demo.spingblog.controllers.MicroControllers;


import com.example.demo.spingblog.models.Ad;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


public class edit {


    @GetMapping("/ads/{id}/edit")
    public String showEditFrom(Model model, @PathVariable long id){

        // find an ad
        Ad adToEdit = adsDao.getById(id);
        model.addAttribute("ad", adToEdit);
        return "ads/edit";


    }


    @PostMapping("ads/{id}/edit")
    @ResponseBody
    public String update(@PathVariable long id,
                         @RequestParam(name = "title") String title,
                         @RequestParam(name = "description") String desc){

        //find an ad
        Ad foundAd = adsDao.getById(id); // select * FROM ads where id = ?
        //edit the ad
        foundAd.setTitle(title);
        foundAd.setDescription(desc);
        //save the changes
        adsDao.save(foundAd);
        return "ad updated";


    }


}

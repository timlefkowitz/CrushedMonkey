package com.example.demo.spingblog.controllers.MicroControllers;

import org.springframework.web.bind.annotation.PathVariable;

public class delete {

    public String destory(@PathVariable long id) {
        adsDao.deleteById(id);
    }

}

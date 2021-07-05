package com.CrushedMonkey.controllers.UserControllers;

/// Here at CrushedMoney, we have a lab. This is an underground video game community. We hustle the day job and create games at night. This became the story of fike.


import com.CrushedMonkey.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/*




            I'm exhaused. It's 2:45 but i must keep learning before class :|


 */
@Controller
public class UserController {

//    private String UsersRepository userDao;
//


    @GetMapping("/users/all")
    public String getAllUsers(Model model) {
        List<User> users = new ArrayList<>();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/user")
    public String getUserString(Model model){return "users";}
//    private final UserRepository usersDao;

//    public UserController(UsersRepository usersDao, String usersRepository);
//


}

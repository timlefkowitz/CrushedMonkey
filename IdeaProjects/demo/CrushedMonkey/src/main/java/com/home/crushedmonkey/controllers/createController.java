package com.home.crushedmonkey.controllers;

import com.home.crushedmonkey.models.BlogPost;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class createController {


    private final BlogPost usersPost;

    public createController(BlogPost usersPost) {
        this.usersPost = usersPost;
    }


    // Create a Users Post

    @GetMapping("/post")
    public String usersPost(Model model)
    {
        model.addAttribute("usersPost", new BlogPost());
//        model.addAttribute("fileStackApi",fileStackApi);
        return"UserPostingForm";
    }

    @PostMapping("/post")
    public String addAnewUserPost(@RequestParam(name="title") String title,
                                  @RequestParam(name="body") String description,
                                  @RequestParam(name="imgPath") String imgPath


    ){

//        user user = (user) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        usersPost n = new usersPost();
//        n.setImgPath(imgPath);
//        user username = n.getOwner(); //n.getOwner().getUsername isn't working but leaving this for the morning cup of coffee..
//        n.setUsername(username);
//        n.setTitle(title);
//        n.setBody(description);
//        usersPost.save(n);
        return "redirect:/home";
    }





    // User Sign Up

    @GetMapping("users/sign-up.html")
    public String Signup(Model model)
    {
//        model.addAttribute("user", new user());
//        model.addAttribute("fileStackApi", fileStackApi);
        return"users/sign-up";
    }

    @PostMapping("users/sign-up.html")
    public String addANewUser(@RequestParam(name="username") String username,
                              @RequestParam(name="email") String email,
                              @RequestParam(name="password") String password,
                              @RequestParam(name="firstname") String firstname,
                              @RequestParam(name="middleName") String middlename,
                              @RequestParam(name="lastName") String lastName,
                              @RequestParam(name="mobile") long mobilenumber,
                              @RequestParam(name="status") String status,
                              @RequestParam(name="profile") String profile,
                              @RequestParam(name="imgPath") String imgPath,
                              @RequestParam(name="originalavatar") String originalavatar


    ){

//        user n = new user();
//        String hash = passwordEncoder.encode(password);
//        n.setPassword(hash);
//        n.setUsername(username);
//        n.setEmail(email);
//        n.setFirstName(firstname);
//        n.setLastName(lastName);
//        n.setMobile(mobilenumber);
//        n.setStatus(status);
//        n.setProfile(profile);
//        n.setImgPath(imgPath);
//        n.setOriginalavatar(originalavatar);
//        usersDao.save(n);
        return "redirect:/home";
    }




// Add a Friend

    // User Sign Up

    @GetMapping("/add")
    public String getaddfriend(Model model)
    {
//        model.addAttribute("user", new user());
//        model.addAttribute("fileStackApi", fileStackApi);
        return"addfriend";
    }

    @PostMapping("/add")
    public String postaddfriend(@RequestParam(name="username") String username


    ){

//        user n = new user();
//        n.setUsername(username);
//        usersDao.save(n);
        return "redirect:/addfriend";
    }



    // Create a Group Post

    @GetMapping("/PostToAGroup")
    public String postToAGroup(Model model)
    {
//        model.addAttribute("fileStackApi",fileStackApi);
//        model.addAttribute("groupId", groupDao.findAll());  // When I come back to this we can link all groupsThatBelongToOwner
        return"GroupPostingForm";
    }

    @PostMapping("/PostToAGroup")
    public String addAnewGroupPost(@RequestParam(name="GroupPosttitle") String title,
                                   @RequestParam(name="GroupPostsummary") String summary,
                                   @RequestParam(name="GroupPostcreatedBy") String createdBy,
                                   @RequestParam(name="GroupPostcontent") String content,
                                   @RequestParam(name="GroupPostIMGPath") String GroupPostIMGPath

    ){
//        groupPost n = new groupPost();
//        n.setTitle(title);
//        n.setBody(summary);
//        n.setImgPath(GroupPostIMGPath);
//        groupPostDao.save(n);
//        groupPost n = new groupPost();
//        groupPostDao.save(n);
        return "redirect:/home";
    }



}

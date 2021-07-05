package com.CrushedMonkey.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String userName;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 250)
    private String password;

    @Column(nullable = false, length = 250)
    private String ad;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Post> posts;

    /*
    ------------------------------------------------------------------------------------------------------------
     */ //          Constructors

    

    //Create
    public User(String userName, String email, String password, List<Post> posts) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.posts = posts;

        // i want to take firstname and lastname off for now
//        this.firstName = firstName;
//        this.lastName = lastName;
    }


    // READ

    public User(Long id, String email, String userName, String password, List<Post> posts){
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.posts= posts;
    }



    //Copy
    public User(User copy){
        id = copy.id;
        email = copy.userName;
        userName = copy.userName;
        password = copy.password;
    }




    //Update constructor

    public User(long id, String userName, String email, String password, List<Post> posts) {
        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;

        // Unsure if i can just add this.post here. because i would have to target the same post when posted?
        this.posts = posts;
    }






    /*
    ------------------------------------------------------------------------------------------------------------
     */

    // Getters and Setters


//    public long getId() {
//        return id;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getUserName() {
//        return userName;
//    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public String getEmail() {
//        return email;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    public List<Ad> getAd(){
//        return ad;
//    }
//
//    public void setAd(<List<Ad> ad){
//        this.ad = ad;
//    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }
}
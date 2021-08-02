package com.home.crushedmonkey.models;


import javax.persistence.*;


@Entity
@Table(name = "BlogImg")
public class BlogImg {

    public BlogImg(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stashFileStackURL")
    private String BlogImg;

    @ManyToOne
    @JoinColumn (name = "BlogPost_id")
    private com.home.crushedmonkey.models.BlogPost BlogPost;

  //insert

    public BlogImg(String blogImg, com.home.crushedmonkey.models.BlogPost blogPost) {
        BlogImg = blogImg;
        BlogPost = blogPost;
    }


    //update

    public BlogImg(long id, String blogImg, com.home.crushedmonkey.models.BlogPost blogPost) {
        this.id = id;
        BlogImg = blogImg;
        BlogPost = blogPost;
    }


    //getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBlogImg() {
        return BlogImg;
    }

    public void setBlogImg(String blogImg) {
        BlogImg = blogImg;
    }

    public com.home.crushedmonkey.models.BlogPost getBlogPost() {
        return BlogPost;
    }

    public void setBlogPost(com.home.crushedmonkey.models.BlogPost blogPost) {
        BlogPost = blogPost;
    }
}

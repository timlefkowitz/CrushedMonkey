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


}

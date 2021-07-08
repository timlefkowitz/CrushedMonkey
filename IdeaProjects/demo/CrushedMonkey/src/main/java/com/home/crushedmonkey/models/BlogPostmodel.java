package com.home.crushedmonkey.models;


import javax.persistence.*;

@Entity
@Table(name="blogPosts")
public class BlogPostmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String img;

}

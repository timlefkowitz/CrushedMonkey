package com.home.crushedmonkey.models;


import javax.persistence.*;

@Entity
@Table(name="blogPosts")
public class BlogPostmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(length = 100)
    private String title;

    @Column()
    private String description;

    @Column()
    private String genre;

    @Column()
    private String img;


    // Constructors

    // Insert Constructor

    public BlogPostmodel(String title, String description, String genre, String img) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.img = img;
    }


    // Update Constructor


    public BlogPostmodel(long id, String title, String description, String genre, String img) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.img = img;
    }

    public BlogPostmodel() {

    }


    // Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

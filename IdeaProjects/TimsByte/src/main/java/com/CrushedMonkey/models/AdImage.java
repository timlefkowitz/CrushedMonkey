package com.CrushedMonkey.models;


import javax.persistence.*;

@Entity
@Table(name = "ad_images")
public class AdImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post Post;

    public AdImage() {}


    //insert
    public AdImage(String path, String description, Post Post) {
        this.path = path;
        this.description = description;
        this.Post = Post;
    }

    //update

    public AdImage(long id, String path, String description, Post Post) {
        this.id = id;
        this.path = path;
        this.description = description;
        this.Post = Post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Post getAd() {
        return Post;
    }

    public void setAd(Post ad) {
        this.Post = Post;
    }
}

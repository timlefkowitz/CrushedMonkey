package com.home.crushedmonkey.models;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="blogPosts")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(length = 100)
    private String title;

    @Column()
    private String description;

    @Column()
    private String genre;

    @Column(nullable = true)
    private String img;

//    @OneToOne
//    private User owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "BlogPost")
    private List<BlogImg> images;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ads_categories",
            joinColumns = {@JoinColumn(name = "BlogPost")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private List<BlogCategory> categories;

    @ManyToOne
    private User user;





    // Constructors

    // Insert Constructor

    public BlogPost(String title, String description, String genre, List<BlogImg> images) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.images = images;
    }


    // Update Constructor


    public BlogPost(long id, String title, String description, String genre, List<BlogImg> images) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.images = images;
    }

    public BlogPost() {

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

    public List<BlogImg> getImages() {
        return images;
    }

    public void setImages(List<BlogImg> images) {
        this.images = images;
    }

    public List<BlogCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<BlogCategory> categories) {
        this.categories = categories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

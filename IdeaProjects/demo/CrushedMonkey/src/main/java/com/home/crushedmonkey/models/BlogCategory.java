package com.home.crushedmonkey.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="BlogCategory")
public class BlogCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<BlogPost> blogs;
}

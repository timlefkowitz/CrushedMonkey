package com.CrushedMonkey.repos.post;

import com.CrushedMonkey.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("From Post as a where a.title like %:term% or a.description like %:term%")
    List<Post> searchByTitle(@Param("tern") String term);

    Post findByTitle(String title); // select * from ads where title = ?
    Post findFirstByTitle(String title); // select * from ads where title = ? limit 1
    Post findByTitleLike(String searchPattern);  //find by title "%INPUT%"

//    List<Ad> searchByTitle(String term);
}

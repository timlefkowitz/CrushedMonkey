package com.home.crushedmonkey.repos;

import com.home.crushedmonkey.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogRepo extends JpaRepository<BlogPost, Long> {


}

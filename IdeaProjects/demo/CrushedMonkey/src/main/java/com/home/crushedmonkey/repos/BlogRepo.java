package com.home.crushedmonkey.repos;

import com.home.crushedmonkey.models.BlogPostmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogRepo extends JpaRepository<BlogPostmodel, Long> {


}

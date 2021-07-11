package com.home.crushedmonkey.repos;

import com.home.crushedmonkey.models.BlogPostmodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<BlogPostmodel, Long> {


}

package com.home.crushedmonkey.repos;

import com.home.crushedmonkey.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {


}

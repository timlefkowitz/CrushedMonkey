package com.home.crushedmonkey.repos;

import com.home.crushedmonkey.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Long> {


}

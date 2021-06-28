package com.example.demo.spingblog.daos;


import com.example.demo.spingblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {


}
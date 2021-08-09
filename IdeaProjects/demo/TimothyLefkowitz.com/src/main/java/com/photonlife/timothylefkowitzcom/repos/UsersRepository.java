package com.photonlife.timothylefkowitzcom.repos;


import com.photonlife.timothylefkowitzcom.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<user, Long> {

//
//    user findByUsername(String userName);
    user getByUsername(String username);
    user getBycontactListOwner(String username);
    user findByUsername(String username);
}

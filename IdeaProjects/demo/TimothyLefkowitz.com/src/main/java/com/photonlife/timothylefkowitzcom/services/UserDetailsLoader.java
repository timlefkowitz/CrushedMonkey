package com.photonlife.timothylefkowitzcom.services;


import com.photonlife.timothylefkowitzcom.models.UserWithRoles;
import com.photonlife.timothylefkowitzcom.models.user;
import com.photonlife.timothylefkowitzcom.repos.UsersRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader implements UserDetailsService {
    private final UsersRepository users;

    public UserDetailsLoader(UsersRepository users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user = users.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }

        return new UserWithRoles(user);
    }
}
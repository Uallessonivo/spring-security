package com.uallesson.springsecurity.domain.services;

import com.uallesson.springsecurity.domain.entities.Role;
import com.uallesson.springsecurity.domain.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    List<User> getUsers();
    UserDetailsService userDetailsService();
}

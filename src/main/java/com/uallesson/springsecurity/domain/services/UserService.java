package com.uallesson.springsecurity.domain.services;

import com.uallesson.springsecurity.domain.models.Role;
import com.uallesson.springsecurity.domain.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
    User findByEmail(String email);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    List<User> getUsers();
}

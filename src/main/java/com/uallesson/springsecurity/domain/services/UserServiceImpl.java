package com.uallesson.springsecurity.domain.services;

import com.uallesson.springsecurity.domain.models.Role;
import com.uallesson.springsecurity.domain.models.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}

package com.uallesson.springsecurity.domain.services;

import com.uallesson.springsecurity.domain.entities.Role;
import com.uallesson.springsecurity.domain.entities.User;
import com.uallesson.springsecurity.domain.exceptions.DomainException;
import com.uallesson.springsecurity.domain.repositories.RoleRepository;
import com.uallesson.springsecurity.domain.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new DomainException("User does not exist");
        }

        return user;
    }

    @Override
    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new DomainException("User does not exist");
        }

        return user;
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new DomainException("User does not exist");
        }

        Role role = roleRepository.findByName(roleName);

        if (role == null) {
            throw new DomainException("Role does not exist");
        }

        user.getRoles().add(role);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}

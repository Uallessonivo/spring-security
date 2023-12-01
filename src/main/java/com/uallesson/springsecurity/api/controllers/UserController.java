package com.uallesson.springsecurity.api.controllers;

import com.uallesson.springsecurity.domain.entities.Role;
import com.uallesson.springsecurity.domain.entities.User;
import com.uallesson.springsecurity.domain.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @PostMapping("/roles")
    public Role saveRole(@RequestBody Role role) {
        return userService.saveRole(role);
    }

    @PostMapping("/users/{username}/roles/{roleName}")
    public void addRoleToUser(@PathVariable String username, @PathVariable String roleName) {
        userService.addRoleToUser(username, roleName);
    }
}

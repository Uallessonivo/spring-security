package com.uallesson.springsecurity;

import com.uallesson.springsecurity.domain.entities.Role;
import com.uallesson.springsecurity.domain.entities.User;
import com.uallesson.springsecurity.domain.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService, PasswordEncoder passwordEncoder) {
        return args -> {
            // Save user
            userService.saveUser(
                    new User(UUID.randomUUID(),
                            "John",
                            "Doe",
                            "johndoe",
                            "teste@teste.com",
                            passwordEncoder.encode("123456"),
                            null));
            // Save role
            userService.saveRole(new Role(UUID.randomUUID(), "ADMIN"));
            userService.saveRole(new Role(UUID.randomUUID(), "MANAGER"));
            // Add role to user
            userService.addRoleToUser("johndoe", "ADMIN");
            userService.addRoleToUser("johndoe", "MANAGER");
        };
    }
}

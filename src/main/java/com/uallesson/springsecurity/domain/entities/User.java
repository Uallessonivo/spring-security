package com.uallesson.springsecurity.domain.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Getter
@Entity
@Builder
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "char(16)")
    private UUID id;
    private String name;
    private String username;
    private String email;
    private String hashedPassword;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

    public User() {
    }

    public User(UUID id, String name, String username, String email, String hashedPassword, Collection<Role> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.roles = roles;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}

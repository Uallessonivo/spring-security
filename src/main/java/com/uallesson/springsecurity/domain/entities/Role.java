package com.uallesson.springsecurity.domain.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Builder
@Getter
public class Role {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "char(16)")
    private UUID id;
    private String name;

    public Role() {
    }

    public Role(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

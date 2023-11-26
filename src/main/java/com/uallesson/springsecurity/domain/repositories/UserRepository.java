package com.uallesson.springsecurity.domain.repositories;

import com.uallesson.springsecurity.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}

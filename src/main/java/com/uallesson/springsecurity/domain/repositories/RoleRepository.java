package com.uallesson.springsecurity.domain.repositories;

import com.uallesson.springsecurity.domain.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}

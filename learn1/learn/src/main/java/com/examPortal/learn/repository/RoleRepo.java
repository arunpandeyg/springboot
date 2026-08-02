package com.examPortal.learn.repository;

import com.examPortal.learn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}

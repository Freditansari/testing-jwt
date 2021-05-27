package com.startdev.io.springsecuritypostgres.Repositories;

import com.startdev.io.springsecuritypostgres.Models.Role;
import com.startdev.io.springsecuritypostgres.Models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}

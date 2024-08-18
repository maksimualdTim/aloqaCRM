package com.aloqaCRM.aloqaCRM.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aloqaCRM.aloqaCRM.model.Role;
import com.aloqaCRM.aloqaCRM.model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
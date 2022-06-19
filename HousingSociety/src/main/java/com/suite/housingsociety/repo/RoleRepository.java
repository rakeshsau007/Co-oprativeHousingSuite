package com.suite.housingsociety.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suite.housingsociety.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
 
    Role findByName(String name);
}
package com.example.spring_security_jwt.repository;

import com.example.spring_security_jwt.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByUsername(String username);
}

package com.javainuse.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
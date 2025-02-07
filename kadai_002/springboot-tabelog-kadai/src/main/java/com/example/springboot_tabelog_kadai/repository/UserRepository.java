package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

}
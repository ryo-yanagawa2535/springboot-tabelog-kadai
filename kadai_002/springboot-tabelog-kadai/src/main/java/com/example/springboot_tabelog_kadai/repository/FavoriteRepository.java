package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
}
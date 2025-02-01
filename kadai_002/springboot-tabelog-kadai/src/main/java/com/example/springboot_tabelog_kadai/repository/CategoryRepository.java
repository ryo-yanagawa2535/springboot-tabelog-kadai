package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot_tabelog_kadai.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
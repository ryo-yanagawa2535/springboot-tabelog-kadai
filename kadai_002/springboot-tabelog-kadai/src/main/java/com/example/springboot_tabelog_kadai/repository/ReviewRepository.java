package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Review;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;


public interface ReviewRepository extends JpaRepository<Review, Integer> {
	
	public Review findByStoreAndUser(Store store , User user);
	
}
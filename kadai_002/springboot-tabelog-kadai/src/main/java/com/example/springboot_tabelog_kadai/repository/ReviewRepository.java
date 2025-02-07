package com.example.springboot_tabelog_kadai.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Review;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;


public interface ReviewRepository extends JpaRepository<Review, Integer> {
	
	public Review findByStoreAndUser(Store store , User user);

	public List<Review> findTop6ByStoreOrderByCreatedAtDesc(Store store);

	public long countByStore(Store store);

	public Page<Review> findByStoreOrderByCreatedAtDesc(Store store, Pageable pageable);
	
}
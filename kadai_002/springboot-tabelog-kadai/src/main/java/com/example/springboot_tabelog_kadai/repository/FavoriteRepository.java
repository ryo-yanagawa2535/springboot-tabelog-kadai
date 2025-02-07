package com.example.springboot_tabelog_kadai.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Favorite;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
	
	public Optional<Favorite> findByStoreAndUser(Store store, User user);

	public Page<Favorite> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
	
}
package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Favorite;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
	
	public Favorite findByStoreAndUser(Store store , User user);
	
	
}
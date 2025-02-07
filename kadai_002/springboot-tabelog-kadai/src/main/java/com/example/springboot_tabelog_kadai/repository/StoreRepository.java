package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Store;


public interface StoreRepository extends JpaRepository<Store, Integer> {
	
	 Page<Store> findByNameLikeOrAddressLikeOrDescriptionLikeOrderByPriceMinAsc(
	            String name, String address, String description, Pageable pageable);

	    Page<Store> findByNameLikeOrAddressLikeOrDescriptionLikeOrderByCreatedAtDesc(
	            String name, String address, String description, Pageable pageable);

	    Page<Store> findByAddressLikeOrderByPriceMinAsc(String address, Pageable pageable);
	    Page<Store> findByAddressLikeOrderByCreatedAtDesc(String address, Pageable pageable);

	    Page<Store> findByPriceMaxLessThanEqualOrderByPriceMinAsc(Integer price, Pageable pageable);
	    Page<Store> findByPriceMaxLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);

	    Page<Store> findAllByOrderByPriceMinAsc(Pageable pageable);
	    Page<Store> findAllByOrderByCreatedAtDesc(Pageable pageable);



}

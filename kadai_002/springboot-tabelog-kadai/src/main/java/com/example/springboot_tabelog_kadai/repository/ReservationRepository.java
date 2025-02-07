package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Reservation;
import com.example.springboot_tabelog_kadai.entity.User;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	Page<Reservation> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
}
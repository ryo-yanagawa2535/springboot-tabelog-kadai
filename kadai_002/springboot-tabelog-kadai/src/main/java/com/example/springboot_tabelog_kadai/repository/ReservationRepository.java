package com.example.springboot_tabelog_kadai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_tabelog_kadai.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
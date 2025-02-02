package com.example.springboot_tabelog_kadai.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot_tabelog_kadai.entity.Reservation;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;
import com.example.springboot_tabelog_kadai.repository.ReservationRepository;
import com.example.springboot_tabelog_kadai.repository.StoreRepository;
import com.example.springboot_tabelog_kadai.repository.UserRepository;

@Service
public class ReservationService {
	private final ReservationRepository reservationRepository;
	private final StoreRepository storeRepository;
	private final UserRepository userRepository;

	public ReservationService(ReservationRepository reservationRepository, StoreRepository storeRepository,
			UserRepository userRepository) {
		this.reservationRepository = reservationRepository;
		this.storeRepository = storeRepository;
		this.userRepository = userRepository;
	}

	@Transactional
	public void create(Map<String, String> paymentIntentObject) {
		Reservation reservation = new Reservation();

		Integer storeId = Integer.valueOf(paymentIntentObject.get("storeId"));
		Integer userId = Integer.valueOf(paymentIntentObject.get("userId"));

		Store store = storeRepository.getReferenceById(storeId);
		User user = userRepository.getReferenceById(userId);
		LocalDate reservationDay = LocalDate.parse(paymentIntentObject.get("reservationDay"));
		Integer numberOfPeople = Integer.valueOf(paymentIntentObject.get("numberOfPeople"));

		reservation.setStore(store);
		reservation.setUser(user);
		reservation.setReservationDay(reservationDay);
		reservation.setNumberOfPeople(numberOfPeople);

		reservationRepository.save(reservation);
	}

	// 宿泊人数が定員以下かどうかをチェックする
	public boolean isWithinCapacity(Integer numberOfPeople, Integer capacity) {
		return numberOfPeople <= capacity;
	}

	// 宿泊料金を計算する
	public Integer calculateAmount(LocalDate checkinDate, LocalDate checkoutDate, Integer price) {
		long numberOfNights = ChronoUnit.DAYS.between(checkinDate, checkoutDate);
		int amount = price * (int) numberOfNights;
		return amount;
	}
}

package com.example.springboot_tabelog_kadai.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot_tabelog_kadai.entity.Review;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;
import com.example.springboot_tabelog_kadai.form.ReviewEditForm;
import com.example.springboot_tabelog_kadai.form.ReviewRegisterForm;
import com.example.springboot_tabelog_kadai.repository.ReviewRepository;

@Service
public class ReviewService {
	private final ReviewRepository reviewRepository;

	public ReviewService(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}

	@Transactional
	public void create(Store store, User user, ReviewRegisterForm reviewRegisterForm) {
		Review review = new Review();
		review.setStore(store);
		review.setUser(user);
		review.setContent(reviewRegisterForm.getContent());
		review.setScore(reviewRegisterForm.getScore());
		reviewRepository.save(review);
	}

	@Transactional
	public void update(ReviewEditForm reviewEditForm) {
		Review review = reviewRepository.getReferenceById(reviewEditForm.getId());
		review.setContent(reviewEditForm.getContent());
		review.setScore(reviewEditForm.getScore());
		reviewRepository.save(review);
	}

	public boolean hasUserAlreadyReviewed(Store store, User user) {
		if (reviewRepository.findByStoreAndUser(store, user) != null) {
			return true; // 条件を満たす場合：trueを返却
		}
		return false; // 条件を満たさない場合：falseを返却
	}
}

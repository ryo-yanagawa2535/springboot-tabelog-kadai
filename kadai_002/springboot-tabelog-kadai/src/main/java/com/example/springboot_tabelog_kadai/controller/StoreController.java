package com.example.springboot_tabelog_kadai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot_tabelog_kadai.entity.Favorite;
import com.example.springboot_tabelog_kadai.entity.Review;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;
import com.example.springboot_tabelog_kadai.form.ReservationInputForm;
import com.example.springboot_tabelog_kadai.repository.FavoriteRepository;
import com.example.springboot_tabelog_kadai.repository.ReviewRepository;
import com.example.springboot_tabelog_kadai.repository.StoreRepository;
import com.example.springboot_tabelog_kadai.security.UserDetailsImpl;
import com.example.springboot_tabelog_kadai.service.FavoriteService;
import com.example.springboot_tabelog_kadai.service.ReviewService;

@Controller
@RequestMapping("/stores")
public class StoreController {
	private final StoreRepository storeRepository;
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private FavoriteService favoriteService;
	@Autowired
	private FavoriteRepository favoriteRepository;

	public StoreController(StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}

	@GetMapping
	public String index(
			@RequestParam(name = "keyword", required = false) String keyword,
			@RequestParam(name = "area", required = false) String area,
			@RequestParam(name = "price", required = false) Integer price,
			@RequestParam(name = "order", required = false) String order,
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable,
			Model model) {

		Page<Store> storePage;

		 if (keyword != null && !keyword.isEmpty()) {
		        if (order != null && order.equals("priceAsc")) {
		            storePage = storeRepository.findByNameLikeOrAddressLikeOrDescriptionLikeOrderByPriceMinAsc(
		                    "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", pageable);
		        } else {
		            storePage = storeRepository.findByNameLikeOrAddressLikeOrDescriptionLikeOrderByCreatedAtDesc(
		                    "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", pageable);
		        }
		    } else if (area != null && !area.isEmpty()) {
		        if (order != null && order.equals("priceAsc")) {
		            storePage = storeRepository.findByAddressLikeOrderByPriceMinAsc("%" + area + "%", pageable);
		        } else {
		            storePage = storeRepository.findByAddressLikeOrderByCreatedAtDesc("%" + area + "%", pageable);
		        }
		    } else if (price != null) {
		        if (order != null && order.equals("priceAsc")) {
		            storePage = storeRepository.findByPriceMaxLessThanEqualOrderByPriceMinAsc(price, pageable);
		        } else {
		            storePage = storeRepository.findByPriceMaxLessThanEqualOrderByCreatedAtDesc(price, pageable);
		        }
		    } else {
		        if (order != null && order.equals("priceAsc")) {
		            storePage = storeRepository.findAllByOrderByPriceMinAsc(pageable);
		        } else {
		            storePage = storeRepository.findAllByOrderByCreatedAtDesc(pageable);
		        }
		    }

		    model.addAttribute("storePage", storePage);
		    
			return "stores/index";
		}

	@GetMapping("/{id}")
	public String show(@PathVariable(name = "id") Integer id, Model model,

			@AuthenticationPrincipal UserDetailsImpl userDetailsImpl) {

		Store store = storeRepository.getReferenceById(id);
		boolean reviewFlag = false;
		boolean favoriteFlag = false;
		Favorite favorite = null;

		if (userDetailsImpl != null) {
			User user = userDetailsImpl.getUser();
			reviewFlag = reviewService.hasUserAlreadyReviewed(store, user);

			favoriteFlag = favoriteService.isFavorite(store, user);

			if (favoriteFlag) {
				favorite = favoriteRepository.findByStoreAndUser(store, user).orElse(null);
			}
		}

		model.addAttribute("reviewFlag", reviewFlag);
		List<Review> reviewList = reviewRepository.findTop6ByStoreOrderByCreatedAtDesc(store);
		model.addAttribute("reviewList", reviewList);
		long totalCount = reviewRepository.countByStore(store);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("store", store);
		model.addAttribute("reservationInputForm", new ReservationInputForm());
		model.addAttribute("favoriteFlag", favoriteFlag);
		model.addAttribute("favorite", favorite);

		return "stores/show";
	}
}

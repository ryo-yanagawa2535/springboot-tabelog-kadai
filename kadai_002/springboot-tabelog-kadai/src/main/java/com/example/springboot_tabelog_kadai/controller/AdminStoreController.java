package com.example.springboot_tabelog_kadai.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.repository.StoreRepository;

@Controller
@RequestMapping("/admin/stores")
public class AdminStoreController {
	private final StoreRepository storeRepository;

	public AdminStoreController(StoreRepository storeRepository) {
	        this.storeRepository = storeRepository;                
	    }

	@GetMapping
	public String index(Model model) {
		List<Store> stores = storeRepository.findAll();

		model.addAttribute("stores", stores);

		return "admin/stores/index";
	}

}

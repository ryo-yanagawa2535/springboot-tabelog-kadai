package com.example.springboot_tabelog_kadai.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot_tabelog_kadai.entity.Favorite;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;
import com.example.springboot_tabelog_kadai.repository.FavoriteRepository;

@Service
public class FavoriteService {
	private final FavoriteRepository favoriteRepository;

	public FavoriteService(FavoriteRepository favoriteRepository) {
		this.favoriteRepository = favoriteRepository;
	}

	@Transactional
	public void create(Store store, User user) {
		Favorite favorite = new Favorite();
		favorite.setStore(store);
		favorite.setUser(user);
		favoriteRepository.save(favorite);
	}

	public boolean isFavorite(Store store, User user) {

		if (favoriteRepository.findByStoreAndUser(store, user) != null) {
			return true; // 条件を満たす場合：trueを返却
		}
		return false; // 条件を満たさない場合：falseを返却
	    }

	public void delete(Integer favoriteId) {
		favoriteRepository.deleteById(favoriteId);
	}

}

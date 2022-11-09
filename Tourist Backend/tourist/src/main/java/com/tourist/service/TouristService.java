package com.tourist.service;

import java.util.List;

import com.tourist.model.Tourist;


public interface TouristService {
	Tourist saveTourist(Tourist tourist);
	List<Tourist> getAllTourists();
	Tourist getTouristById(int id);
	List<Tourist> findAllByOrderByFirstNameDesc();
	
	
}



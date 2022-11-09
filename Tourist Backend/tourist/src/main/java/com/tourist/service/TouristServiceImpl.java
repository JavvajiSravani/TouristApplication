package com.tourist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourist.model.Tourist;
import com.tourist.repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService{

	@Autowired
	private TouristRepository touristRepo;
	
	public TouristServiceImpl(TouristRepository touristRepo) {
		super();
		this.touristRepo = touristRepo;
	}

	@Override
	public Tourist saveTourist(Tourist tourist) {
		return touristRepo.save(tourist);
	}

	@Override
	public List<Tourist> getAllTourists() {
		return touristRepo.findAll();
	}
	
	

	@Override
	public Tourist getTouristById(int id) {
		return touristRepo.findById(id).orElseThrow(null);
		
	}
	@Override
	public List<Tourist> findAllByOrderByFirstNameDesc(){
		return touristRepo.findAllByOrderByFirstNameDesc();
	}


}
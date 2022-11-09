package com.tourist.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.model.Tourist;
import com.tourist.service.TouristService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/tourist")
public class TouristController {
	@Autowired
	private TouristService touristService;
	@Autowired
	public TouristController(TouristService touristService) {
		super();
		this.touristService = touristService;
	}
	@PostMapping("/tourists")
	public ResponseEntity<Tourist> saveTourist(@RequestBody Tourist tourist){
		return new ResponseEntity<Tourist>(touristService.saveTourist(tourist), HttpStatus.CREATED);
	}
	@GetMapping
	public List<Tourist> getAllTourists(){
		return touristService.getAllTourists();
	}
	@GetMapping("/findtourists")
	public List<Tourist> findAllByOrderByFirstNameDesc(){
		return touristService.findAllByOrderByFirstNameDesc();
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<Tourist> getTouristById(@PathVariable("id") int touristId){
		return new ResponseEntity<Tourist>(touristService.getTouristById(touristId), HttpStatus.OK);
	}
}

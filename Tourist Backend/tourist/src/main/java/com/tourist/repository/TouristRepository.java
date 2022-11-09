package com.tourist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tourist.model.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist,Integer>{
	
	List<Tourist> findAllByOrderByFirstNameDesc();

}

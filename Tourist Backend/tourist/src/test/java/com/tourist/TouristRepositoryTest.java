package com.tourist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourist.model.Tourist;
import com.tourist.repository.TouristRepository;

@SpringBootTest
public class TouristRepositoryTest {
	@Autowired
	private TouristRepository touristRepository;
	
	@Test
	public void saveTouristTest() {
		Tourist tourist=new Tourist();
		tourist.setId(155);
		tourist.setFirstName("venkat");
		tourist.setLastName("lakshmi");
		tourist.setGender("female");
		tourist.setAge(20);
		tourist.setFromPlace("warangal");
		tourist.setNoOfDays(6);
		touristRepository.save(tourist);
		assertNotNull(tourist);
		
	}
	@Test
	public void testReadAll() {
		List <Tourist> list=touristRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testSingleTourist() {
		 Tourist tourist=touristRepository.findById(5).get();
		 assertEquals(23,tourist.getAge());
	}

}

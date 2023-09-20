package com.project.tourist;
import com.project.tourist.entity.Tourist;
import com.project.tourist.repository.TouristRepository;
import com.project.tourist.services.TouristServices;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class TouristApplicationTests {
	@Autowired
	private TouristServices service;
	@MockBean
	private TouristRepository repo;
	
	@Test
	public void addTourist() {
		Tourist t = new Tourist(11,"Vinay ", "Kumar","Male",18,"UK", 28);
		when(repo.save(t)).thenReturn(t);
		assertEquals(t, service.addTourist(t));
	}
	
	@Test
	void contextLoads() {
	}
	 
	
	
	
	
}

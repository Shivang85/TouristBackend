package com.project.tourist.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tourist.entity.Tourist;
import com.project.tourist.services.TouristServices;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tourists")
public class Controller {
	@Autowired
	private TouristServices ts;
	
	@GetMapping("/get")
	public List<Tourist> gettourist(){
		return ts.getTourist();
	}
	
	@PostMapping("/add")
	public Tourist addtourist(@RequestBody Tourist t) {
		return ts.addTourist(t);
	}
	
	@PutMapping("/update")
	public String updateTourist(@RequestBody Tourist t) {
		return ts.updateTourist(t);
	}
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTourist(@PathVariable int id) {
        if (ts.deleteTourist(id)) {
            return ResponseEntity.ok("Tourist with ID " + id + " deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	
}





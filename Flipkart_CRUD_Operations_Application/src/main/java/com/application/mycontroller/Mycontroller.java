package com.application.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Flip;
import com.application.service.Myserviceinter;

@RestController
@RequestMapping("/flip")

public class Mycontroller {
	@Autowired
	private Myserviceinter service;
	
	@PostMapping("/save") 
	public Flip save(@RequestBody Flip flip) {
		return service.save(flip);
	}
	@GetMapping("/")
	public List<Flip> findAll() {
		return service.findAll();
	}
	@GetMapping("/{id}")
	public List<Flip> findById(@PathVariable int id) {
		return service.findById(id);
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	

}

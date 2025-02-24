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

import com.application.model.Zepto;
import com.application.service.MyserviceInter;

@RestController
@RequestMapping("/zepto")
public class Mycontroller {
	@Autowired
	private MyserviceInter service;
	
	@PostMapping("/save")
	public Zepto save(@RequestBody Zepto zepto) {
		return service.save(zepto);
		
	}
	@GetMapping("/") 
	public List<Zepto> findAll() {
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Zepto findById(@PathVariable int id) {
		return service.findById(id);
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	@GetMapping("/price/{price}")
	public Zepto findByPrice(@PathVariable int price) {
		return service.findByPrice(price);
	}
	@GetMapping("/greater/{price}")
	public List<Zepto> findByPriceIsBreaterThan(@PathVariable int price) {
		return service.findByPriceIsGreaterThan(price);
	}
	@GetMapping("/print/{price}")
	public List<Zepto> printPrice(@PathVariable int price) {
		return service.printPrice(price);
	}
	
	
	
	

}

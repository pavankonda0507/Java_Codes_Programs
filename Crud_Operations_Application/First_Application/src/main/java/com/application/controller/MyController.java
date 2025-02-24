package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.Model.User;
import com.application.service.UserServiceInter;

@RestController
@RequestMapping("/user")
public class MyController {
	@Autowired
	private UserServiceInter service;
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return service.save(user);
	}
	
		
	
	

}

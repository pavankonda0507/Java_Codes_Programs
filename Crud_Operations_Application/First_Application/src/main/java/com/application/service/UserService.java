package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.Model.User;
import com.application.repository.UserRepository;

@Service
public class UserService implements UserServiceInter {
	@Autowired
	private UserRepository repository;
	public User save(User user) {
		return repository.save(user);
	}
	

}

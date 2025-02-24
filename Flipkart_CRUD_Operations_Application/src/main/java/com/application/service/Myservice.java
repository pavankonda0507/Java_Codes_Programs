package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Flip;
import com.application.repo.Myrepo;
@Service

public class Myservice implements Myserviceinter {
	@Autowired
	private Myrepo repo;
	@Override
	public Flip save(Flip flip) {
		return repo.save(flip);
	}
	@Override
	public List<Flip> findAll() {
		// TODO Auto-generated method stub
		return (List<Flip>) repo.findAll();
	}
	@Override
	public List<Flip> findById(int id) {
		// TODO Auto-generated method stub
		return (List<Flip>) repo.findById(id).get();
	}
	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		Flip flip = (Flip) findById(id);
		System.out.println(id+ " item found");
		repo.delete(flip);
		return "Item deleted successfully";
	}
	
}

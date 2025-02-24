package com.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.application.model.Zepto;
import com.application.repository.Myrepository;

@Service
public class Myservice implements MyserviceInter {
	@Autowired
	private Myrepository repo;
	
	public Zepto save(Zepto zepto) {
		return repo.save(zepto);
	}
	public List<Zepto> findAll(){
		return (List<Zepto>) repo.findAll(Sort.by("price").descending());
	}
	public Zepto findById(int id) {
		return repo.findById(id).get();
	}
	public String deleteById(int id) {
		Zepto zepto = findById(id);
		System.out.println(id+" Item found in zepto");
		System.out.println(zepto);
		repo.delete(zepto);
		return "Item deleted successfully";
	}
	public Zepto findByPrice(int price) {
		return repo.findByPrice(price);
	}
	public List<Zepto> findByPriceIsGreaterThan(int price) {
		return repo.findByPriceIsGreaterThan(price);
	}
	@Override
	public List<Zepto> printPrice(int price) {
		return repo.printPrice(price);
	}
	
	
	
	

}

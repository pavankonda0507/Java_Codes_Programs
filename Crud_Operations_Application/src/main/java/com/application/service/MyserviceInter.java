package com.application.service;

import java.util.List;
import java.util.Optional;

import com.application.model.Zepto;

public interface MyserviceInter {
	Zepto save(Zepto zepto);
	List<Zepto> findAll();
	Zepto findById(int id);
	String deleteById(int id);
	Zepto findByPrice(int price);
	List<Zepto> findByPriceIsGreaterThan(int price);
	List<Zepto> printPrice(int price);
	

}

package com.application.service;

import java.util.List;

import com.application.model.Flip;

public interface Myserviceinter {

	Flip save(Flip flip);

	List<Flip> findAll();

	String deleteById(int id);

	List<Flip> findById(int id);

}

package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.application.model.Zepto;
@Repository
public interface Myrepository extends JpaRepository<Zepto, Integer> {
	Zepto findByPrice(int price);
	List<Zepto> findByPriceIsGreaterThan(int price);
	@Query(value="from Zepto where price=:price")
	List<Zepto> printPrice(int price);
	

}

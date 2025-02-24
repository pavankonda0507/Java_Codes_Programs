package com.application.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Flip;

@Repository
public interface Myrepo extends CrudRepository<Flip,Integer>{

}

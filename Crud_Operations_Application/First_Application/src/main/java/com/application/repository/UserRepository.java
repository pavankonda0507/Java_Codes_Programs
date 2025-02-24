package com.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.application.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}

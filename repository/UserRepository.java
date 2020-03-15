package com.cakestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.cakestore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsername (String username);

}

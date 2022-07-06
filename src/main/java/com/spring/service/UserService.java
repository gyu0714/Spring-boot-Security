package com.spring.service;

import java.util.Optional;

import com.spring.entity.User;

public interface UserService {
	
	public Optional<User> findByIdPw(String id);

}

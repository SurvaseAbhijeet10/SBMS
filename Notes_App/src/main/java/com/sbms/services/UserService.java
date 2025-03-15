package com.sbms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.User;
import com.sbms.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public User saveUser(User u) {
		return this.userRepo.save(u);
	}

	public Optional<User> getUser(Integer user_id) {
		return userRepo.findById(user_id);
	}
}

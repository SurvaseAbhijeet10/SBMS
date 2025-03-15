package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByName(String uname);
}

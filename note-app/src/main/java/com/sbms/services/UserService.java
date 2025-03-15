package com.sbms.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sbms.entity.User;
import com.sbms.repository.UserRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	public User saveUser(User u) {
		return this.userRepo.save(u);
	}

	public Optional<User> getUser(Integer user_id) {
		return userRepo.findById(user_id);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Find the user from the repository
		User user = userRepo.findByName(username);

		// Check if the user is found
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}

		// Convert roles or authorities if needed (assuming no roles for now)
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		// Return a Spring Security User object with username, password, and authorities
		return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), authorities);
	}

}

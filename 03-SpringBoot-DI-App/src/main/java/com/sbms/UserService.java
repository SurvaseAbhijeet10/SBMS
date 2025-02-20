package com.sbms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao UserDao;
	
	public UserService() {
		System.out.println("UserService: Default-Constructor");
	}
	@Autowired
	public UserService(UserDao userDao) {
		System.out.println("paramiterized constructor");
	}
	
	public void getName(int id) {
		String FindName = UserDao.findName(id);
		System.out.println(FindName);
	}
}

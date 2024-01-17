package com.jobBoard.user.service;

import com.jobBoard.user.entity.User;

public interface UserService {

	User getUserById(Long id); 
	void createUser(User user); 
	void updateUser(Long id, User user); 
	void removeUser(Long id); 
	
}

package com.jobBoard.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobBoard.user.entity.User;
import com.jobBoard.user.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User getUserById(Long id) {
		return userRepo.findById(id).orElse(null); 
	}

	@Override
	public void createUser(User user) {
		userRepo.save(user); 
		
	}

	@Override
	public void updateUser(Long id, User user) {
		User existingUser = getUserById(id); 
		if(existingUser != null) {
			existingUser.setFirstName(user.getFirstName());
			existingUser.setLastName(user.getLastName());
			existingUser.setEmail(user.getEmail());
			userRepo.save(existingUser); 
		}
		
	}

	@Override
	public void removeUser(Long id) {
		userRepo.deleteById(id);
		
	} 
	

}

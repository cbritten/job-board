package com.jobBoard.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobBoard.user.entity.User;
import com.jobBoard.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController{

	@Autowired
	private UserService userService;
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	@PutMapping
	public void updateUser(@PathVariable Long id, @RequestBody User user) {
		userService.updateUser(id, user);
	}
	@DeleteMapping
	public void removeUser(@PathVariable Long id) {
		userService.removeUser(id);
	} 
	
}

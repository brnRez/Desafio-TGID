package com.transferegid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transferegid.domain.user.Users;
import com.transferegid.dtos.UserDTO;
import com.transferegid.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
 
	@PostMapping
	public ResponseEntity<Users> createUser(UserDTO user){
		return new ResponseEntity<>(newUser)
	}
	
}

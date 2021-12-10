package com.jankenfighteralpha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jankenfighteralpha.entity.Users;
import com.jankenfighteralpha.repository.UserRepository;
import com.jankenfighteralpha.service.RegistrationService;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RegistrationService register;
	
	@PostMapping(value="/saveUser",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public void submitUserDetails(@RequestBody Users user) {
		// #1: Find the avatar by ID user.getAvatar.getHeadPart
		// #2: Search the database for that part object
		// #3: After finding the object, set that object to the avatar instead of user user.getAvatar.setAvatar to found object
		// #4: Repeat for all already saved objects
		register.registerUser(user);
	}
	
	@GetMapping(value="/findUserById",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> findbyUserId(int userId) {
		Users user = userRepository.findById(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}

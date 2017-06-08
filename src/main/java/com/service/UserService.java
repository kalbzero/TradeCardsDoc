package com.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.domain.User;
import com.repository.UserRepository;

/**
 * @author Edward Ramos
 */
@Service
public class UserService {

	private final UserRepository userRepository;

	/* Constructor */
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	
	/* Methods */
	public List<User> ListByName(String fullName){
		return userRepository.findByFullNameContainingIgnoreCase(fullName);
	}

	public User findByFullName(String fullName){
		return userRepository.findAllByFullNameIgnoreCase(fullName);
	}
   
}
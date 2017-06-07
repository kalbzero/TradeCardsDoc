package com.Repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findAllByFullNameIgnoreCase(String fullName);
	
	public List<User> findByFullNameContainingIgnoreCase(String fullName);
}
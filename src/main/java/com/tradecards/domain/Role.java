package com.tradecards.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Role {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String role;
	
	@ManyToMany
	private Set<User> user = new HashSet<User>();

	/* Constructor */
	public Role(){}
	public Role(Long id, String role, Set<User> user) {
		super();
		this.id = id;
		this.role = role;
		this.user = user;
	}
	
	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
}

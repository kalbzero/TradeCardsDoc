package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class City {

	@Id
    @GeneratedValue
	private Long id;
	
	@NotNull
	private String name;
	
	@ManyToOne
	private State state;

	/* Constructor */
	public City() {}
	public City(Long id, String name, State state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}

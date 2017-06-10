package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
    @GeneratedValue
	private Long cityId;
	private String name;
	
	@ManyToOne
	private State state;
	
	/* Constructor */
	public City(Long cityId, String name, State state) {
		this.cityId = cityId;
		this.name = name;
		this.state = state;
	}

	/* Getters 'n' Setters */
	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
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

	@Override
	public String toString() {
		return "Name= " + name + "/" + state;
	}
	
	
	
}
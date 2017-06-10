package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {

	@Id
	private String ufId;
	private String name;
	
	/* Constructor */
	public State(String ufId, String name) {
		super();
		this.ufId = ufId;
		this.name = name;
	}

	/* Getters 'n' Setters */
	public String getUfId() {
		return ufId;
	}

	public void setIdState(String ufId) {
		this.ufId = ufId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

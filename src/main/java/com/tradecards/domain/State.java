package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class State {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String uf;
	
	@NotNull
	private String name;

	/* Constructor */
	public State(){}
	public State(Long id, String uf, String name) {
		super();
		this.id = id;
		this.uf = uf;
		this.name = name;
	}
	
	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id
	private String id;
	private String nome;
	
	/* Constructor */
	public Estado(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	/* Getters 'n' Setters */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}

package com.tradecards.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Papel {

	@Id
	@GeneratedValue
	private Long id;

	private String papel;
	
	@ManyToMany
	private Set<Usuario> usuario = new HashSet<Usuario>();
	
	public Papel() {
		
	}

	/* Constructor */
	public Papel(Long id, String papel, Set<Usuario> usuario) {
		this.id = id;
		this.papel = papel;
		this.usuario = usuario;
	}

	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}
}

package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade {

	@Id
    @GeneratedValue
	private Long id;
	
	@NotNull
	private String nome;
	
	@ManyToOne
	private Estado estado;

	public Cidade() {
		
	}
	
	
	/* Constructor */
	public Cidade(Long id, String nome, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}



	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return nome + "/" + estado.getUf();
	}

	
	
	
	
}

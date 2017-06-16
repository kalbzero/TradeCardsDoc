package com.tradecards.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author Edward Ramos
 */
@Entity
public class Carta {

	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
    private String edicao;
	
	@NotNull
    private String nome;
	
    private Boolean ehFoil;
    private Boolean ehAlterada;
	
    /* Constructor */
    public Carta(Long id, String edicao, String nome, Boolean ehFoil, Boolean ehAlterada) {
		super();
		this.id = id;
		this.edicao = edicao;
		this.nome = nome;
		this.ehFoil = ehFoil;
		this.ehAlterada = ehAlterada;
	}

    /* Getters 'n' Setters */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getEhFoil() {
		return ehFoil;
	}

	public void setEhFoil(Boolean ehFoil) {
		this.ehFoil = ehFoil;
	}

	public Boolean getEhAlterada() {
		return ehAlterada;
	}

	public void setEhAlterada(Boolean ehAlterada) {
		this.ehAlterada = ehAlterada;
	}

}
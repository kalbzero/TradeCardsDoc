package com.tradecards.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Edward Ramos
 */
@Entity
public class Carta {

	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
	@Column(length = 20)
	@Size(min = 1, max = 20)
    private String edicao;
	//TODO RNG008
	
	@NotNull
	@Column(length = 30)
	@Size(min = 1, max = 30)
    private String nome;
	//TODO RNG008
	
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
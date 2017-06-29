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
public class Card {

	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
	@Column(length = 20)
	@Size(min = 1, max = 20)
    private String edition;
	//TODO RNG008
	
	@NotNull
	@Column(length = 30)
	@Size(min = 1, max = 30)
    private String name;
	//TODO RNG008
	
    private Boolean isFoil;
    private Boolean isAltered;
	
    
    
    /* Constructor */
    public Card() {}
	public Card(Long id, String edition, String name, Boolean isFoil, Boolean isAltered) {
		super();
		this.id = id;
		this.edition = edition;
		this.name = name;
		this.isFoil = isFoil;
		this.isAltered = isAltered;
	}
	
	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsFoil() {
		return isFoil;
	}
	public void setIsFoil(Boolean isFoil) {
		this.isFoil = isFoil;
	}
	public Boolean getIsAltered() {
		return isAltered;
	}
	public void setIsAltered(Boolean isAltered) {
		this.isAltered = isAltered;
	}
}
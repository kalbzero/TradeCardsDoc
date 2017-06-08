package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Edward Ramos
 */
@Entity
public class Card {

	@Id
    @GeneratedValue
    private Long cardId;
    private String edition;
    private String name;
    private Boolean isFoil;
    private Boolean isAltered;
	
    
    
    /* Constructor */
    public Card(Long cardId, String edition, String name, Boolean isFoil, 
    		Boolean isAltered) {
		this.cardId = cardId;
		this.edition = edition;
		this.name = name;
		this.isFoil = isFoil;
		this.isAltered = isAltered;
	}



    /* Getters 'n' Setters */
	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
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
    
	/* toString */
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", edition=" + edition + ", name=" + name + ", isFoil=" + isFoil
				+ ", isAltered=" + isAltered + "]";
	}

}
package com.tradecards.domain;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Edward Ramos
 */

@Entity
public class User {

	@Id
    @GeneratedValue
    private Long userId;
    private String email;
    private String fullName;   
    private String password;
    private String phoneNumber;
    private City city;


    /* Constructor */
    public User(Long userId, String email, String fullName, String password, 
    		String phoneNumber, City city) {
		
		this.userId = userId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.city = city;
	}
    
    /**
     * @return
     */
    public List<Card> listHaveCards() {
        // TODO implement here
        return null;
    }

	/**
     * @return
     */
    public List<Card> listWantCards() {
        // TODO implement here
        return null;
    }

    /* Getters 'n' Setters */
	public Long getUserId() {
		return userId;
	}

	public void setIdUser(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	/* toString */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", fullName=" + fullName + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", city=" + city + ", state=" + city.getState() + "]";
	}
    

}
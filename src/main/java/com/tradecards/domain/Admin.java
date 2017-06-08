package com.tradecards.domain;

import javax.persistence.Entity;

/**
 * @author Edward Ramos
 */
@Entity
public class Admin extends User {

   
	/* Constructor */
    public Admin(Long userId, String email, String fullName, String password, 
    		String phoneNumber, City city) {
		super(userId, email, fullName, password, phoneNumber, city);
		
	}
    
    

}
package com.tradecards.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

/**
 * @author Edward Ramos
 */
@Entity
public class Admin extends User{

	/* Constructors */
	public Admin() {
		super();
	}
	public Admin(Long id, String email, String fullName, String password, String phone, City city, Boolean active,
			Set<Role> role, List<Card> haveList, List<Card> wantList) {
		super(id, email, fullName, password, phone, city, active, role, haveList, wantList);
		
	}

	
}
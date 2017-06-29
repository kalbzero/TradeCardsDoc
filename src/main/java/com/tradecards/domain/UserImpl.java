package com.tradecards.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/* User importado  de security e nao do domain*/
public class UserImpl extends User {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Este User eh do Domain
	private User user;
	
	/* Constructors */
	public UserImpl(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		
	}
	
	/* Getters 'n' Setters*/
	public User getusuario(){
		return user;
	}
	
	public void setUsuario(User user){
		this.user = user;
	}
}

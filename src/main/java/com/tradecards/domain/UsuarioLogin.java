package com.tradecards.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/* User importado  de security e nao do domain*/
public class UsuarioLogin extends User {

	private Usuario usuario;
	
	
	
	/* Getters 'n' Setters*/
	public Usuario getusuario(){
		return usuario;
	}
	
	public void setUsuario(Usuario usuario){
		this.usuario = usuario;
	}
	
	/* Constructors */
	public UsuarioLogin(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public UsuarioLogin(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}
	
	public UsuarioLogin(String username,
	            String password,
	            boolean enabled,
	            boolean accountNonExpired,
	            boolean credentialsNonExpired,
	            boolean accountNonLocked,
	            Collection<? extends GrantedAuthority> authorities,
	            Usuario usuario) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.usuario = usuario;
	}
}

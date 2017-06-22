package com.tradecards.domain;

import javax.persistence.Entity;

/**
 * @author Edward Ramos
 */
@Entity
public class Admin extends Usuario {

	public Admin(Long id, String email, String nomeCompleto, String senha, String telefone, Cidade cidade, Boolean ativo) {
		super(id, email, nomeCompleto, senha, telefone, cidade, ativo);
		
	}

   
	
    
    

}
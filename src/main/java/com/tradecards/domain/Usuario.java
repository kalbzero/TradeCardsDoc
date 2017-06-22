package com.tradecards.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * @author Edward Ramos
 */

@Entity
public class Usuario {

	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
	@Email
    private String email;
	
	@NotNull
    private String nomeCompleto;
	
	@NotNull
    private String senha;
	
	@NotNull
    private String telefone;
    
    @ManyToOne
    private Cidade cidade;
    
    @NotNull
    private Boolean ativo;
    
    @ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_papel", joinColumns = { @JoinColumn(name = "usuario_id") }, inverseJoinColumns = { @JoinColumn(name = "papel_id") })

    private Set<Papel> papel =  new HashSet<Papel>();

    /*
     * Constructor
     */
    		
	public Usuario(Long id, String email, String nomeCompleto, String senha, String telefone, Cidade cidade, Boolean ativo) {
		this.id = id;
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.senha = senha;
		this.telefone = telefone;
		this.cidade = cidade;
		this.ativo = ativo;
	}

	/* Getters 'n' Setters */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Set<Papel> getPapel() {
		return papel;
	}

	public void setPapel(Set<Papel> papel) {
		this.papel = papel;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", nomeCompleto=" + nomeCompleto + ", senha=" + senha
				+ ", telefone=" + telefone + ", cidade=" + cidade + "]";
	}
    
}
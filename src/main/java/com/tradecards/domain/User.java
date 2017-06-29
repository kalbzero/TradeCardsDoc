package com.tradecards.domain;

import java.util.HashSet;
import java.util.List;
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
public class User {

	@Id
    @GeneratedValue
    private Long id;
	
	@NotNull
	@Email
    private String email;
	
	@NotNull
    private String fullName;
	
	@NotNull
    private String password;
	
	@NotNull
    private String phone;
    
    @ManyToOne
    private City city;
    
    @NotNull
    private Boolean active;
    
    @ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })

    private Set<Role> role =  new HashSet<Role>();

    @ManyToMany
    @JoinTable(name = "have_list", joinColumns = {@JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "card_id")})
    private List<Card> haveList;
    
    @ManyToMany
    @JoinTable(name = "want_list", joinColumns = {@JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "card_id")})
    private List<Card> wantList;

    /* Constructors */
    public User(){}
	public User(Long id, String email, String fullName, String password, String phone, City city, Boolean active,
			Set<Role> role, List<Card> haveList, List<Card> wantList) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.phone = phone;
		this.city = city;
		this.active = active;
		this.role = role;
		this.haveList = haveList;
		this.wantList = wantList;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	public List<Card> getHaveList() {
		return haveList;
	}
	public void setHaveList(List<Card> haveList) {
		this.haveList = haveList;
	}
	public List<Card> getWantList() {
		return wantList;
	}
	public void setWantList(List<Card> wantList) {
		this.wantList = wantList;
	}
}
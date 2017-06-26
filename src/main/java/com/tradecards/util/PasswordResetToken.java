package com.tradecards.util;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.tradecards.domain.Usuario;

@Entity
public class PasswordResetToken {
	private static final int EXPIRATION = 60 * 24;
	  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    private String token;
  
    @OneToOne(targetEntity = Usuario.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "usuario_id")
    private Usuario usuario;
  
    private Date expiryDate;
}

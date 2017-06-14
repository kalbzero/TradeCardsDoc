package com.tradecards.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradecards.domain.Carta;
/**
 * 
 */
public interface CartaRepository extends JpaRepository<Carta, Long> {
	
	public Carta findAllByNomeIgnoreCase(String nome);
	
	public List<Carta> findByNomeContainingIgnoreCase(String nome);
}
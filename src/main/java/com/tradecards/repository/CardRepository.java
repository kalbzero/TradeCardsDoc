package com.tradecards.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradecards.domain.Card;
/**
 * 
 */
public interface CardRepository extends JpaRepository<Card, Long> {
	
	public Card findAllByNameIgnoreCase(String name);
	
	public List<Card> findByNameContainingIgnoreCase(String name);
}
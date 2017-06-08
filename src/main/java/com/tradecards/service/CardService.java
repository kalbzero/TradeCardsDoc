package com.tradecards.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.tradecards.domain.Card;
import com.tradecards.repository.CardRepository;
/**
 * @author Edward Ramos
 */
@Service
public class CardService {

	private final CardRepository cardRepository;
	
	/* Constructor */
	public CardService(CardRepository cardRepository){
		this.cardRepository = cardRepository;
	}
	
	
	
	/* Methods */
	public List<Card> ListByName(String name){
		return cardRepository.findByNameContainingIgnoreCase(name);
	}
	
	public Card FindByName(String name){
		return cardRepository.findAllByNameIgnoreCase(name);
	}
	
	
}
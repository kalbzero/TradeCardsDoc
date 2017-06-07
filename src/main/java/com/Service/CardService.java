package com.Service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.Repository.CardRepository;
import com.Domain.Card;
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
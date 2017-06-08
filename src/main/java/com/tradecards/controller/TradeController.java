package com.tradecards.controller;

import org.springframework.stereotype.Controller;

import com.tradecards.service.CardService;
import com.tradecards.service.UserService;

/**
 * @author Edward Ramos
 */
@Controller
public class TradeController {

	private UserService userService;
	private CardService cardService;
	
	/* Constructor */
	public TradeController(UserService userService, CardService cardService) {
		this.userService = userService;
		this.cardService = cardService;
	}
	
	
	
	/* Methods */
	
	
	
	
}
package com.controller;

import org.springframework.stereotype.Controller;

import com.service.CardService;
import com.service.UserService;

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
package com.tradecards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tradecards.service.CartaService;

/**
 * @author Edward Ramos
 */

@Controller
@RequestMapping("/card")
public class CartaController {

	private CartaService cartaService;

	/* Constructor */
	public CartaController(CartaService cartaService) {
		this.cartaService = cartaService;
	}
	
	
	/* Methods */
	@GetMapping("/manageCards")
	public String manageCards(){
		return "/admin/manageCards";
	}
	

}
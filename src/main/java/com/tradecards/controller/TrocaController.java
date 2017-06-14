package com.tradecards.controller;

import org.springframework.stereotype.Controller;

import com.tradecards.service.CartaService;
import com.tradecards.service.UsuarioService;

/**
 * @author Edward Ramos
 */
@Controller
public class TrocaController {

	private UsuarioService usuarioService;
	private CartaService cartaService;
	
	/* Constructor */
	public TrocaController(UsuarioService usuarioService, CartaService cartaService) {
		this.usuarioService = usuarioService;
		this.cartaService = cartaService;
	}
	
	
	
	/* Methods */
	
	
	
	
}
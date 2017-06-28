package com.tradecards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tradecards.service.CartaService;
import com.tradecards.service.UsuarioService;

/**
 * @author Edward Ramos
 */
@Controller
@RequestMapping("/user")
public class TrocaController {

	private UsuarioService usuarioService;
	private CartaService cartaService;
	
	/* Constructor */
	public TrocaController(UsuarioService usuarioService, CartaService cartaService) {
		this.usuarioService = usuarioService;
		this.cartaService = cartaService;
	}
	
	
	
	/* Methods */
	@GetMapping("/searchCard")
	   public String home(Model model){
		model.addAttribute("cartas");
		   return "/user/searchCard";
	   }
	
	
	
}
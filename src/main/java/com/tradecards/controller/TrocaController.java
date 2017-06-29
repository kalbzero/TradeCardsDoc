package com.tradecards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tradecards.service.CartaService;
import com.tradecards.service.TrocaService;
import com.tradecards.service.UsuarioService;

/**
 * @author Edward Ramos
 */
@Controller
@RequestMapping("/user")
public class TrocaController {

	private TrocaService trocaService;
	
	/* Constructor */
	public TrocaController(TrocaService trocaService) {
		this.trocaService = trocaService;
		
	}
	public TrocaController(){}
	
	
	/* Methods */
	@GetMapping("/searchCard")
	   public String home(Model model){
		//model.addAttribute("cards", trocaService.list());
		   return "/user/searchCard";
	   }
	
	
	
}
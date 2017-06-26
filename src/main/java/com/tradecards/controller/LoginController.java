package com.tradecards.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tradecards.service.LoginService;
import com.tradecards.util.Resposta;

@Controller
public class LoginController {

	private final LoginService loginService;
	private MessageSource messageSource;

	public LoginController(LoginService loginService, MessageSource messageSource) {
		this.loginService = loginService;
		this.messageSource = messageSource;
	}
	
	@PostMapping(value= "/forgotPassword", produces = "application/json")
	public @ResponseBody Resposta rememberPassword(@RequestParam String email){
		
		if(loginService.contaExistente(email)){
			loginService.recuperarSenha(email);
			this.messageSource.getMessage("login.reset", null, null);
		}
		return new Resposta(this.messageSource.getMessage("login.error", null, null));
	}
	
}

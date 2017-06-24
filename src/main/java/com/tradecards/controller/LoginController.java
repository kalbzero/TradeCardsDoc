package com.tradecards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tradecards.service.LoginService;

@Controller
public class LoginController {

	private final LoginService loginService;

	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	
	
}

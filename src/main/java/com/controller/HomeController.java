package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * 
 * @author Edward Ramos
 *
 */
@Controller
public class HomeController {
	
	/*
	 * template/index.html
	 */
	@GetMapping("/")
	public String index(){
		return "index";
	}

	/*
	 * template/user/home.html
	 */
	@GetMapping("/home")
	public String home(){
		return "user/home";
	}
}

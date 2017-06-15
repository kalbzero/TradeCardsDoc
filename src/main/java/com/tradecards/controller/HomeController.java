package com.tradecards.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Edward Ramos
 */
@Controller
public class HomeController {

	/*
	 * Se estiver logado, aparece a pagina Home, se nao, a pagina index.
	 */
	@GetMapping("/")
    public String index(Principal principal) {
        return principal == null ? "/index" : "/user/home";
    }

	@GetMapping("/error")
    public String error() {
        return "/error";
    }
	
	@GetMapping("/international")
    public String getInternationalPage() {
        return "international";
    }
}
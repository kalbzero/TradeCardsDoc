package com.tradecards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tradecards.service.UsuarioService;

/**
 * @author Edward Ramos
 */
@Controller
@RequestMapping("/user")
public class UsuarioController {

   private UsuarioService usuarioService;
   
   /* Constructor */
   public UsuarioController (UsuarioService usuarioService){
	   this.usuarioService = usuarioService;
   }


   
   /* Methods */
   @GetMapping("/home")
   public String home(){
	   return "/user/home";
   }
   
   
}
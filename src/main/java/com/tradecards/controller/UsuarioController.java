package com.tradecards.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tradecards.domain.Usuario;
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
   public String home(Principal p){
	   return "/user/home";
   }
   
   @GetMapping("/perfil")
   public String perfil(Usuario u){
	   return "/user/pefil";
   }
   
   @GetMapping("/haveList")
   public String haveList(Principal p){
	   return "/user/haveList";
   }
   
   @GetMapping("/wantList")
   public String wantList(Principal p){
	   return "/user/wantList";
   }
   
   
   /* Edit */
   @GetMapping("/edit/perfil/{id}")
   public String editPerfil(){
	   
	   return "/user/perfil";
   }
   
   @GetMapping("/edit/haveList/{id}")
   public String editHaveList(){
	   
	   return "/user/haveList";
   }
   
   @GetMapping("/edit/wantList/{id}")
   public String editWantList(){
	   
	   return "/user/wantList";
   }
}
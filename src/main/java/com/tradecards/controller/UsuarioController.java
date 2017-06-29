package com.tradecards.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
   public String home(Principal p, Model model){
	   model.addAttribute("user");
	   model.addAttribute("havelist");
	   model.addAttribute("wantlist");
	   
	   return "/user/home";
   }
   
   @GetMapping("/perfil")
   public String perfil(Model model, Principal p){
	   //Infos do usuario logado
	   return "/user/perfil";
   }
   
   @GetMapping("/viewUser/{id}")
   public String viewUser(Model model, Long id){
	   //TODO RNG013
	   model.addAttribute("user", usuarioService.findOne(id));
	   model.addAttribute("havelist", usuarioService.get(id).getHaveList());
	   model.addAttribute("wantlist", usuarioService.get(id).getWantList());
	   
	   return "/user/home";
   }
   
   @GetMapping("/haveList")
   public String haveList(Principal p, Model model){
	   model.addAttribute("havelist");
	   return "/user/haveList";
   }
   
   @GetMapping("/wantList")
   public String wantList(Principal p, Model model){
	   model.addAttribute("wantlist");
	   return "/user/wantList";
   }
}
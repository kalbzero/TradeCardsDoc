package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Service.UserService;

/**
 * @author Edward Ramos
 */
@Controller
@RequestMapping("/user")
public class UserController {

   private UserService userService;
   
   /* Constructor */
   public UserController (UserService userService){
	   this.userService = userService;
   }


   
   /* Methods */
   @GetMapping("/home")
   public String home(){
	   return "/user/home";
   }
   
   
}
package com.tradecards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	
	@GetMapping("/searchUsers")
	public String searchUsers(){
		return "/admin/searchUsers";
	}
	   
	@GetMapping("/generateReport")
	public String generateReport(){
		return "/admin/generateReport";
	}
	   
	@GetMapping("/manageCards")
	public String manageCards(){
		return "/admin/manageCards";
	}
	   
}

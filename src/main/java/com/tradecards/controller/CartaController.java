package com.tradecards.controller;

import java.text.MessageFormat;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tradecards.domain.Carta;
import com.tradecards.service.CartaService;

/**
 * @author Edward Ramos
 */

@Controller
@RequestMapping("/card")
public class CartaController {

	private CartaService cartaService;
	private MessageSource messageSource;

	/* Constructor */
	public CartaController(CartaService cartaService, MessageSource messageSource) {
		this.cartaService = cartaService;
		this.messageSource = messageSource;
	}
	
	
	/* Methods */
	@GetMapping("/manageCards")
	public String manageCards(Model model){
		model.addAttribute("cards",cartaService.list());
		//TODO RNG001
		//TODO RNG002
		return "/admin/manageCards";
	}
	
	@RequestMapping("/create")
	public String create(Model model){
		model.addAttribute("cards", new Carta());
		model.addAttribute("readonly", false);
		return "/card/manageCards";
	}

	@RequestMapping("/edit/{id}")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("cards", cartaService.get(id));
		//TODO RNG004
		model.addAttribute("readonly", true);
		return "/card/manageCards";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model, RedirectAttributes redirectAttrs, Locale locale) {
		Carta carta = cartaService.get(id);
		//TODO RNG006
		if (carta != null) {
			cartaService.delete(id);
			model.addAttribute("message",
					redirectAttrs.addFlashAttribute(messageSource.getMessage("cards.deleted", null, locale), id));
			return "redirect:/card/manageCards";
		}else{
			model.addAttribute("message",
					MessageFormat.format(messageSource.getMessage("cards.deleted.failed", null, locale), id));
		}
		
		return "/card/manageCards";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@Valid Carta carta, BindingResult bindingResult, Model model, RedirectAttributes redirectAttrs,
			Locale locale) {
		if (!bindingResult.hasErrors()) {
			// TODO RNG007
			Carta savedCarta = cartaService.save(carta);
			
			if(savedCarta.getNome() != "" && savedCarta.getEdicao()!= ""){
				redirectAttrs.addFlashAttribute("message", messageSource.getMessage("cards.saved", null, locale));
				return "redirect:/card/manageCards" + "?success";
			}else{
				redirectAttrs.addFlashAttribute("message", messageSource.getMessage("Blank fields", null, locale));
				return "redirect:/card/manageCards" + "?error";
			}
			
		}
		model.addAttribute("readonly", false);
		return "/card/manageCards";
	}
}



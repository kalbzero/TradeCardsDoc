package com.tradecards.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.tradecards.domain.Carta;
import com.tradecards.repository.CartaRepository;

/**
 * @author Edward Ramos
 */
@Service
public class CartaService {

	private final CartaRepository cartaRepository;
	
	/* Constructor */
	public CartaService(CartaRepository cartaRepository){
		this.cartaRepository = cartaRepository;
	}
	
	
	
	/* Methods */
	public List<Carta> ListByNome(String nome){
		return cartaRepository.findByNomeContainingIgnoreCase(nome);
	}
	
	public Carta FindByNome(String nome){
		return cartaRepository.findAllByNomeIgnoreCase(nome);
	}
	
	public Iterable<Carta> list(){
		//TODO RNG003
		return this.cartaRepository.findAll();
	}
	
	public Carta get(Long id) {
		return cartaRepository.findOne(id);
	}
	
	public void delete(Long id) {
		cartaRepository.delete(id);
	}
	
	public Carta save(Carta carta) {
		//TODO RNG005
		if(carta.getNome()=="" && carta.getEdicao()==""){
			return carta;
		}else{
			//TODO RNG010
			
			return cartaRepository.save(carta);
		}
	}
	
}
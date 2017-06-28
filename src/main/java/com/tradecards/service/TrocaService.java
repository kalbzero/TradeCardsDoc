package com.tradecards.service;

import java.util.List;

import com.tradecards.domain.Carta;
import com.tradecards.repository.CartaRepository;
import com.tradecards.repository.UsuarioRepository;

/**
 * @author Edward Ramos
 */
public class TrocaService {

	private final CartaRepository cartaRepository;
	private final UsuarioRepository usuarioRepository; 
	
    /**
     * Default constructor
     */

	public TrocaService(CartaRepository cartaRepository, UsuarioRepository usuarioRepository) {
		super();
		this.cartaRepository = cartaRepository;
		this.usuarioRepository = usuarioRepository;
	}
    
	public List<Carta> list(){
		List<Carta> cartas = null;
		int numberUsers = 0;
		
		for(int i=0; i <= numberUsers; i++){
			//pegar a lista de cartas de cada usuario e colcoar tudo dentro de um list.
				
			
		}
		
		return cartas;
	}
    

}
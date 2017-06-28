package com.tradecards.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.tradecards.domain.Usuario;
import com.tradecards.repository.UsuarioRepository;

/**
 * @author Edward Ramos
 */
@Service
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;

	/* Constructor */
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	
	
	/* Methods */
	public List<Usuario> ListByName(String nomeCompleto){
		return usuarioRepository.findByNomeCompletoContainingIgnoreCase(nomeCompleto);
	}

	public Usuario findByFullName(String nomeCompleto){
		return usuarioRepository.findAllByNomeCompletoIgnoreCase(nomeCompleto);
	}
	
	public Usuario findOne(Long id){
		return usuarioRepository.findOne(id);
	}
   
	public Usuario save(Usuario usuario){
		Usuario registro = usuarioRepository.save(usuario);
		return registro;
	}
	
	public Usuario get(Long id){
		return this.usuarioRepository.findAllByid(id);
	}
}


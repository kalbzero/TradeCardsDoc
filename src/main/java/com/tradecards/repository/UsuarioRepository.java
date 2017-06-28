package com.tradecards.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tradecards.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findAllByNomeCompletoIgnoreCase(String nomeCompleto);
	public Optional<Usuario> findByEmail(String email);
	public Usuario findAllByid(Long id);
	public List<Usuario> findByNomeCompletoContainingIgnoreCase(String nomeCompleto);
}
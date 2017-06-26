package com.tradecards.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tradecards.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findByNomeCompletoIgnoreCase(String nomeCompleto);
	public Optional<Usuario> findByEmail(String email);
	public Usuario findOneById(Long id);
	public Usuario findOneByEmail(String email);
	public List<Usuario> findByNomeCompletoContainingIgnoreCase(String nomeCompleto);
}
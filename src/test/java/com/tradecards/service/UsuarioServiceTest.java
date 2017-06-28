package com.tradecards.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.tradecards.domain.Usuario;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioServiceTest {

	@Autowired
	private UsuarioService usuarioService;
	
	@Test
	public void testIfSomeUsuarioGetsItsNameReturned() {
		assertThat(usuarioService.ListByName("Fulano").get(0).getNomeCompleto()).isEqualTo("Fulano Silva");
		assertThat(usuarioService.ListByName("Esse nome nao existe")).isEmpty();
	}
	
	@Test
	public void testIfFindOneByName() {
		assertThat(usuarioService.findByFullName("Fulano").getNomeCompleto()).isEqualTo("Fulano Silva");
		assertThat(usuarioService.findByFullName("Joao").getNomeCompleto()).isNotEqualTo("Fulano Silva");
	}
	
	@Test
	public void testIfSaveUsuario() {
		Usuario u = usuarioService.findOne(2l);
		assertThat(usuarioService.save(u).getNomeCompleto()).isEqualTo(u.getNomeCompleto());
	}
	
	@Test
	public void testIfReturnUsuarioById() {
		assertThat(usuarioService.findOne(2l).getNomeCompleto().compareTo("Beltrano Silva"));
	}
	
}

package com.tradecards.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void testIfThePersonExistsInTheRepository() {
		assertThat(usuarioRepository
				.findByNomeCompletoContainingIgnoreCase("Fulano")
				).isNotEmpty();
		assertThat(usuarioRepository
				.findByNomeCompletoContainingIgnoreCase("This User not exist in the system.")
				).isEmpty();
	}
}

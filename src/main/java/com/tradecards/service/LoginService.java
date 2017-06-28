package com.tradecards.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tradecards.domain.Usuario;
import com.tradecards.domain.Papel;
import com.tradecards.domain.UsuarioLogin;
import com.tradecards.repository.UsuarioRepository;



@Service
public class LoginService implements UserDetailsService{

	private final UsuarioRepository usuarioRepository;
	private final NotificacaoService notificacaoService;

	/* Constructor*/
	@Autowired
	public LoginService(UsuarioRepository usuarioRepository, NotificacaoService notificacaoService) {
		this.usuarioRepository = usuarioRepository;
		this.notificacaoService = notificacaoService;
	}
	
	
	/* Methods*/
	public boolean contaExistente(String email){
		return this.usuarioRepository.findByEmail(email).isPresent();
	}
	
	private void atualizarSenha(String password, Usuario usuario){
		usuario.setSenha(new BCryptPasswordEncoder().encode(password));
		this.usuarioRepository.save(usuario);
	}
	
	public void recuperarSenha(String email){
		
		Map<String,String> options = new HashMap();
    	options.put("to", email);
    	options.put("subject", "TradeCards - Recuperar Senha");
    	options.put("text", "Acesse o link X para alterar a sua senha. ");
    	
    	this.notificacaoService.enviarNotificacao(options);
	}


	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		return usuarioRepository.findByEmail(email)
				.map(usuario -> new UsuarioLogin(
						usuario.getEmail(),
						usuario.getSenha(),
						usuario.getAtivo(),
                        true, 
                        true, 
                        true, 
                        usuario.getPapel().stream().map(
                        		papel -> new SimpleGrantedAuthority(papel.getPapel()))
								.collect(Collectors.toList()),
                        usuario
                )).orElseThrow(() -> new UsernameNotFoundException("couldn't find " + email + "!"));
	}
}

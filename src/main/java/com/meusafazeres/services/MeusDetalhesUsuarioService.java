package com.meusafazeres.services;

import java.nio.file.attribute.UserPrincipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.meusafazeres.models.Usuario;
import com.meusafazeres.repos.UsuarioRepositorio;

@Service
public class MeusDetalhesUsuarioService implements UserDetailsService {
	
	@Autowired UsuarioRepositorio usuarioRepos;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepos.findByUsername(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado! :/");
		}
		
		return new com.meusafazeres.models.UserPrincipal(usuario);
//		return new UserPrincipal(usuario);
	}

}

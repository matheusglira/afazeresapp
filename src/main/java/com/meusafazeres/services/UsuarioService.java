package com.meusafazeres.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meusafazeres.models.Usuario;
import com.meusafazeres.repos.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired private UsuarioRepositorio usuarioRepos;
	
	public void salvar(Usuario usuario) {
		usuarioRepos.save(usuario);
		
	}

}

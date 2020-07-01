package com.meusafazeres.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusafazeres.models.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsername(String username);
}

package com.meusafazeres.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.meusafazeres.models.Usuario;
import com.meusafazeres.services.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired private UsuarioService usuarioService;
	
	
	@PostMapping(value="usuarios/add")
	public RedirectView add(Usuario usuario, RedirectAttributes redir) {
		usuarioService.salvar(usuario);
		
		RedirectView redirectView = new RedirectView("/login", true);
		redir.addFlashAttribute("messagem", "Cadastro concluído com sucesso!");
		return redirectView;
	}
}

package com.meusafazeres.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meusafazeres.models.Tarefas;
import com.meusafazeres.services.TarefasService;

@Controller
public class AppController {
	
	@Autowired
	private TarefasService tarefasService;
	
	@GetMapping("/")
	public String tarefas(Model model) {
		
		List<Tarefas> listaTarefas = tarefasService.getTarefas();
		
		model.addAttribute("tarefas", listaTarefas);
		
		return "index";
	}
	
	@PostMapping("/index/addTarefa")
	public String novaTarefa(Tarefas tarefas){
		tarefasService.salvar(tarefas);
		return "redirect:/index";
	}
	
	@RequestMapping("/tarefas/pesquisar")
	@ResponseBody
	public Optional<Tarefas> pesquisar(int id){
		return tarefasService.pesquisar(id);
	}
	
	@RequestMapping(value ="/tarefas/alterar", method= {RequestMethod.PUT, RequestMethod.GET})
	public String alterar(Tarefas tarefas){
		tarefasService.salvar(tarefas);
		return "redirect:/index";
	}
	
	@RequestMapping(value ="/tarefas/deletar", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String deletar(Integer id){
		tarefasService.deletar(id);
		return "redirect:/index";
	}
	
	//LOGIN E LOGOUT
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cadastrar";
	}
}

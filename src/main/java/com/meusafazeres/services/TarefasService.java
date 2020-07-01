package com.meusafazeres.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meusafazeres.models.Tarefas;
import com.meusafazeres.repos.TarefasRepositorio;

@Service
public class TarefasService {
	
	@Autowired
	private TarefasRepositorio tarefaRepositorio;
	
	//Retorna lista de tarefas
	public List<Tarefas> getTarefas(){
		return tarefaRepositorio.findAll();
	}
	
	public void salvar(Tarefas tarefas) {
		tarefaRepositorio.save(tarefas);
	}
	
	public Optional<Tarefas> pesquisar(int id) {
		return tarefaRepositorio.findById(id);
	}

	public void deletar(Integer id) {
		tarefaRepositorio.deleteById(id);
	}
}

package com.meusafazeres.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusafazeres.models.Tarefas;

public interface TarefasRepositorio extends JpaRepository<Tarefas, Integer>{

}

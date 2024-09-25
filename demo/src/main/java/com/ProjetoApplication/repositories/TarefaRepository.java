package com.ProjetoApplication.repositories;



	import
	com.seuprojeto.entities.Usuario;

import entities.Tarefa;

import
	org.springframework.data.jpa.repository.JpaRepository;
	
	public interface TarefaRepository
	extends JpaRepository<Tarefa, Long>{
		
	}
	


package com.seuprojeto.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProjetoApplication.repositories.UsuarioRepository;

import entities.Categoria;
import entities.Tarefa;

@Controller
@RequestMapping("/tarefas")
public class TarefaController{
	
	@Autowired
	private UsuarioRepository
	usuariorepository;
	
	@Autowired
	private UsuarioRepository
	tarefaRepository;
	
	@Autowired
	private UsuarioRepository
	categoriaRepository;
	
	@GetMapping("/criar")
	public String
	criarTarefaForm(Model model) {
		model.addAttribute("Tarefa", new Tarefa());
		
		model.addAttribute("Usuarios", usuariorepository.findAll());
		
		model.addAttribute("Categoria", categoriaRepository.findAll());
		
		return "criarTarefa";
		
		
	}
	
	@PostMapping("/salvar")
	public String
	salvarTarefa(@ModelAttribute Tarefa tarefa) {
		tarefa.setDataCriacao(LocalDate.now());
		
	//	tarefaRepository.save(tarefa);
		return "redirect:/tarefas";
	}
	@GetMapping
	public String
	listarTarefas(Model model) {
		model.addAttribute("Tarefas",tarefaRepository.findAll());
		return "listarTarefas";
	}
	
	
}
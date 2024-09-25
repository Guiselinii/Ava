package com.seuprojeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Categoria;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private categoriaRepository categoriaRepository;
	
	@GetMapping("/criar")
	public String criarCategoriaForm(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "criarCategoria";
	}
	
	@PostMapping("/salvar")
	public String
	salvarCategoria(@ModelAttribute Categoria categoria) {
		categoriaRepository.save(categoria);
		return "redirect:/categorias";
	}
	
	@GetMapping
	public String 
	listarCategorias(Model model) {
		model.addAttribute("categorias", categoriaRepository.findAll());
		return "listarCategorias";
	}
	
}

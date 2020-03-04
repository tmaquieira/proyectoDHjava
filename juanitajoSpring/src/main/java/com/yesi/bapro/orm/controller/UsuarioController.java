package com.yesi.bapro.orm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yesi.bapro.orm.model.Usuario;
import com.yesi.bapro.orm.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("usuarios")
public class UsuarioController {
	@Autowired
	UsuarioJpaRepository usuarioJpaRepository;
	
	//public MovieController(MovieJpaRepository movieJpaRepository){
	//this.movieJpaRepository=movieJpaRepository;
	//this.CategoriasJpaRepository=categoriasJpaRepository de esa manera conectamos los repositorios necesarios de la base de datos}

	@GetMapping("/add")
	public String registrarCliente(Usuario usuario) {
		return "registroClientes";
	}

	@PostMapping("/add")
	public String insertarUsuario(@Valid Usuario usuario, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "registroClientes";
		}
		usuarioJpaRepository.save(usuario);
		return "redirect:/usuarios/all";
	}

	@GetMapping("/all")
	public String allUsuarios(Model model) {
		List<Usuario> usuarioList = usuarioJpaRepository.findAll();
		model.addAttribute("listaDeUsuarios", usuarioList);
		return "listClientes";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUsuario (@PathVariable ("id") Integer id) {
		usuarioJpaRepository.deleteById(id);
		return "redirect:/listClientes/all";
	}
}

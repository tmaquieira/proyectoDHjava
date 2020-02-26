package com.yesi.bapro.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yesi.bapro.orm.model.Usuario;
import com.yesi.bapro.orm.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("registro")

public class UsuarioController {
	@Autowired
	UsuarioJpaRepository usuarioJpaRepository;
	
	@GetMapping("add")
    public String agregarCliente () {
		return ("registro");
	}
	
	@PostMapping("add")
	public String insertarUsuario ( Usuario registro) {
		usuarioJpaRepository.save(registro);
		return "clientProfile";
	}
	
	@GetMapping("all")
	public String allUsuarios(Model model) {
	List<Usuario> usuarioList = usuarioJpaRepository.findAll();
	model.addAttribute("listaDeUsuarios", usuarioList);
	return "clientes";
	}
	
	}


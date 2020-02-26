package com.yesi.bapro.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
	
	@GetMapping
	public String irAHome ( ) {
		return "home";
	}
	
	@RequestMapping("registro/clientProfile")
	public String irAClientProfile() {
		return "clientProfile";
	}
	
	@RequestMapping("clientes")
	public String irATodosLosClientes() {
		return "clientes";
	}
}

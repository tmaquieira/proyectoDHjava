package com.yesi.bapro.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HomeController {
	
	@RequestMapping(value={"/", "home", "home.html"}, method=RequestMethod.GET)
	public String irAHome() {
		return "home";
	}

	@GetMapping("faq.html")
	public String irAFaq() {
		return "./faq";
	}
	@GetMapping("contact.html")
	public String irAcontact() {
		return "./contact";
	}
	@GetMapping("login.html")
	public String irAlogin() {
		return "./login";
	}
	
	@GetMapping("perfilCliente.html")
	public String irAperfilCli() {
		return "./perfilCliente";
	}
	/*@GetMapping("/")
	public String irAHome() {
		return "home";
	}*/

	@RequestMapping("registro/perfilCliente")
	public String irAClientProfile() {
		return "perfilCliente";
	}

	@RequestMapping("listClientes")
	public String irATodosLosClientes() {
		return "listClientes";
	}

	@RequestMapping("/shoppingCart")
	public String irACarrito() {
		return "shoppingCart";
	}
}

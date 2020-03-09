package com.yesi.bapro.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HomeController {
	
	@RequestMapping(value={"/", "home"}, method=RequestMethod.GET)
	public String irAHome() {
		return "home";
	}

	@RequestMapping(value={"faq"}, method=RequestMethod.GET)
	public String irAFaq() {
		return "./faq";
	}
	
	@RequestMapping(value={"contact"}, method=RequestMethod.GET)
	public String irAcontact() {
		return "./contact";
	}
	
	@RequestMapping(value={"login"}, method=RequestMethod.GET)
	public String irAlogin() {
		return "./login";
	}
	
	@RequestMapping(value={"perfilCliente"}, method=RequestMethod.GET)
	public String irAperfilCli() {
		return "./perfilCliente";
	}
	/*@GetMapping("/")
	public String irAHome() {
		return "home";
	}*/
	
	@RequestMapping(value={"listClientes"}, method=RequestMethod.GET)
	public String irATodosLosClientes() {
		return "listClientes";
	}

	/*@RequestMapping(value={"carrito"}, method=RequestMethod.GET)
	public String irACarrito() {
		return "carrito";
	}*/
}

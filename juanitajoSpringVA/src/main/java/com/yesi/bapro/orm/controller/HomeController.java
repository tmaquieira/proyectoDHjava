package com.yesi.bapro.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yesi.bapro.orm.model.Productos;
import com.yesi.bapro.orm.repository.ProductosJpaRepository;

@Controller
@RequestMapping
public class HomeController {
	@Autowired
	ProductosJpaRepository productosJpaRepository;
	
	@RequestMapping(value={"/", "home"}, method=RequestMethod.GET)
	public String irAHome(Model model) {
		List<Productos> productoList = productosJpaRepository.findAll();
		model.addAttribute("listaDeProductos", productoList);
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
	
	@RequestMapping(value={"listClientes"}, method=RequestMethod.GET)
	public String irATodosLosClientes() {
		return "listClientes";
	}

	/*@RequestMapping(value={"carrito"}, method=RequestMethod.GET)
	public String irACarrito() {
		return "carrito";
	}*/
	/*@GetMapping("/")
	public String irAHome() {
		return "home";
	}*/
}

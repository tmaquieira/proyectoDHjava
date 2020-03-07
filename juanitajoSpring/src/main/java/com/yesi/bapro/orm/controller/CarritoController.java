package com.yesi.bapro.orm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yesi.bapro.orm.model.Productos;
import com.yesi.bapro.orm.model.Usuario;
import com.yesi.bapro.orm.repository.ProductosJpaRepository;
import com.yesi.bapro.orm.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	@Autowired
	ProductosJpaRepository productosJpaRepository;
	
	@Autowired
	UsuarioJpaRepository usuarioJpaRepository;
	
	
	
	@PostMapping("/add/{productos_id}")
	public String addProducto (@PathVariable("productos_id") Integer productos_id) {
		
		
		Optional<Productos> opcion2= this.productosJpaRepository.findById(productos_id);
		Productos productos = opcion2.get();
		
		Optional<Usuario> opcion= this.usuarioJpaRepository.findById((Integer) 1);
		Usuario usuario = opcion.get();
		
		
		usuario.addProduct(productos);
		
		this.usuarioJpaRepository.save(usuario);
		
		return "redirect:/productos/all";
		
		
		
	}
	
	@GetMapping("")
	public String carrito (Model model) {
		Optional<Usuario> opcion = this.usuarioJpaRepository.findById((Integer)1);
		Usuario usuario = opcion.get();
		
		
		List<Productos> carrito = usuario.getCarrito();
		
		
		model.addAttribute("carrito", carrito);
		return "carrito";
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

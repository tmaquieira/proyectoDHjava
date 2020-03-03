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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yesi.bapro.orm.model.Productos;
import com.yesi.bapro.orm.model.Usuario;
import com.yesi.bapro.orm.repository.CategoriasJpaRepository;
import com.yesi.bapro.orm.repository.ProductosJpaRepository;

@Controller
@RequestMapping("productos")
public class ProductoController {
	@Autowired
	ProductosJpaRepository productosJpaRepository;
	@Autowired
	CategoriasJpaRepository categoriasJpaRepository;

	@GetMapping("/add")
	public String agregarProducto(Productos producto, Model model) {
		model.addAttribute("categorias", this.categoriasJpaRepository.findAll());
		return "registroProductos";
	}

	@PostMapping("/add")
	public String insertarProducto(@Valid Productos producto, BindingResult bindingResult, RedirectAttributes redirAtt) {
	/*	@RequestParam("posterUpload") MultipartFile file
		producto.setCategoria();*/
		if(bindingResult.hasErrors()) {
			return "registroProductos";
		}
		productosJpaRepository.save(producto);
		redirAtt.addFlashAttribute("mensaje", "Producto cargado Exitosamente :)");
		return "redirect:/productos/all";
	}
	
	@GetMapping("/all")
	public String allProductos(Model model) {
		List<Productos> productoList = productosJpaRepository.findAll();
		model.addAttribute("listaDeProductos", productoList);
		return "productos";
	}
	
	/*
	@GetMapping("registroProductos/edit/{id}")
	public String editarProducto() {
		return ("registroProductos");
	}
	*/
	@PostMapping(value="/delete/{id}")
	public String deleteProductos (@PathVariable ("id") Integer id) {
		productosJpaRepository.deleteById(id);
		return "redirect:/productos/all";
	}

}

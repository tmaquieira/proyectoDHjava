package com.yesi.bapro.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yesi.bapro.orm.model.Productos;
import com.yesi.bapro.orm.repository.ProductosJpaRepository;

@Controller
@RequestMapping
public class ProductoController {
	@Autowired
	ProductosJpaRepository productosJpaRepository;

	@GetMapping("registroProductos/add")
	public String agregarProducto() {
		return ("registroProductos");
	}

	@PostMapping("registroProductos/add")
	public String insertarProducto(Productos producto) {
		productosJpaRepository.save(producto);
		return "registroProductosOk";
	}

	@GetMapping("registroProductos/all")
	public String allProductos(Model model) {
		List<Productos> productoList = productosJpaRepository.findAll();
		model.addAttribute("listaDeProductos", productoList);
		return "listProductos";
	}

}

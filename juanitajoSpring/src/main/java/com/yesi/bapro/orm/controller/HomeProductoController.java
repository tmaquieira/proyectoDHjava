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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yesi.bapro.orm.model.Categoria;
import com.yesi.bapro.orm.model.Productos;
import com.yesi.bapro.orm.model.Usuario;
import com.yesi.bapro.orm.repository.CategoriaJpaRepository;
import com.yesi.bapro.orm.repository.ColorJpaRepository;
import com.yesi.bapro.orm.repository.ProductosJpaRepository;

@Controller
@RequestMapping("")
public class HomeProductoController {
	@Autowired
	ProductosJpaRepository productosJpaRepository;
	@Autowired
	CategoriaJpaRepository categoriaJpaRepository;
	@Autowired
	ColorJpaRepository colorJpaRepository;


	@GetMapping("")
	public String allProductosInHome(Model model) {
		List<Productos> productoList = productosJpaRepository.findAll();
		model.addAttribute("listaDeProductos", productoList);
		return "home";
	}
	

}

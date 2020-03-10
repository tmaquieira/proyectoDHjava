package com.yesi.bapro.orm.controller;

import java.util.List;
import java.util.Optional;

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

import com.yesi.bapro.orm.model.Categoria;
import com.yesi.bapro.orm.model.Productos;
import com.yesi.bapro.orm.model.Usuario;
import com.yesi.bapro.orm.repository.CategoriaJpaRepository;
import com.yesi.bapro.orm.repository.ColorJpaRepository;
import com.yesi.bapro.orm.repository.ProductosJpaRepository;
import com.yesi.bapro.orm.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("carrito")
public class CarritoController {
	@Autowired
	ProductosJpaRepository productosJpaRepository;
	@Autowired
	CategoriaJpaRepository categoriaJpaRepository;
	@Autowired
	ColorJpaRepository colorJpaRepository;
	@Autowired
	UsuarioJpaRepository usuarioJpaRepository;

	@PostMapping("/add/{id}")
	public String addProduct(@PathVariable("id") Integer id) {
		Optional<Productos> opcion2=this.productosJpaRepository.findById(id);
		Productos producto = opcion2.get();
		
		Optional<Usuario> opcion=this.usuarioJpaRepository.findById((Integer) 3);
		Usuario usuario = opcion.get();
		
		usuario.addProduct(producto);
		this.usuarioJpaRepository.save(usuario);
		return "redirect:/productos/all";
	}
	
	@GetMapping("")
	public String carrito(Model model) {
		Optional<Usuario> opcion=this.usuarioJpaRepository.findById((Integer) 3);
		Usuario usuario = opcion.get();
		List<Productos> carrito = usuario.getCarrito();
		model.addAttribute("carrito", carrito);
		return "carrito";
	}
	
	@PostMapping(value="/delete")
	public String deleteProductosSeleccionados () {
		usuarioJpaRepository.vaciarCarrito();
		/*Optional<Usuario> opcion=this.usuarioJpaRepository.findById((Integer) 3);
		Usuario usuario = opcion.get();
		List<Productos> carrito = usuario.getCarrito();
		model.addAttribute("carrito", carrito);

		carrito.removeAll(carrito);*/
		return "redirect:/carrito";
	}
}

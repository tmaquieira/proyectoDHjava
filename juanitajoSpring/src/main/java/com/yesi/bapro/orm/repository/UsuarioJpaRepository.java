package com.yesi.bapro.orm.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yesi.bapro.orm.model.Usuario;

@Repository
public interface UsuarioJpaRepository extends JpaRepository <Usuario, Integer> {
	@Modifying
	@Transactional
	@Query(value="DELETE FROM carrito", nativeQuery=true)
	public void vaciarCarrito();
}

package com.yesi.bapro.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yesi.bapro.orm.model.Usuario;

@Repository
public interface UsuarioJpaRepository extends JpaRepository <Usuario, Integer> {

}

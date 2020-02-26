package com.yesi.bapro.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yesi.bapro.orm.model.Productos;

@Repository
public interface ProductosJpaRepository extends JpaRepository <Productos, Integer> {

}




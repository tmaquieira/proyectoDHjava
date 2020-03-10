package com.yesi.bapro.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yesi.bapro.orm.model.Categoria;
import com.yesi.bapro.orm.model.Color;
import com.yesi.bapro.orm.model.Productos;

@Repository
public interface ColorJpaRepository extends JpaRepository <Color, Integer> {

}




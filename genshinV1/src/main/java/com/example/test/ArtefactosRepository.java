package com.example.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtefactosRepository extends JpaRepository<Artefactos, Long> {
	 List<Artefactos> findByRareza(String rareza);
	 List<Artefactos> findByNombre(String nombre);
}

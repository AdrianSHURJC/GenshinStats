package com.example.test;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames = "artefactos")
public interface ArtefactosRepository extends JpaRepository<Artefactos, Long> {
	 List<Artefactos> findByRareza(String rareza);
	 List<Artefactos> findByNombre(String nombre);
}

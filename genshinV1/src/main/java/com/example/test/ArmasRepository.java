package com.example.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmasRepository extends JpaRepository<Armas, Long> {
	public List<Armas> findByNombre(String nombre);
	
	public List<Armas> findByRareza(String rareza);
	
	public List<Armas> findByTipoDeArma(String tipoDeArma);

	public List<Armas> findByEstadistica2(String estadistica2);
	public List<Armas> findByRarezaAndTipoDeArma(String rareza, String tipoDeArma);
	
	public List<Armas> findByRarezaAndEstadistica2(String rareza, String estadistica2);

	public List<Armas> findByTipoDeArmaAndEstadistica2(String tipoDeArma, String estadistica2);
	
	
	
	}

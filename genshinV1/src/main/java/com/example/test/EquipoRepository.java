package com.example.test;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@CacheConfig(cacheNames = "equipo")
@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
	//Optional<Equipo> findById(Long id);
	@CacheEvict(allEntries = true)
	Equipo save(Equipo equipo);
	@Cacheable
	Optional<Equipo> findById(long id);
	@Cacheable
	List<Equipo> findAll();
}
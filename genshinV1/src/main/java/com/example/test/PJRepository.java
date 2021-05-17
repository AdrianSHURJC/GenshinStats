package com.example.test;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@CacheConfig(cacheNames = "personajes")
@Repository
public interface PJRepository extends JpaRepository<Personaje, Long> {
	 List<Personaje> findByAtribute(String atribute);
	 List<Personaje> findByName(String name);
	 
	 @Cacheable
	 List<Personaje> findAll();
}

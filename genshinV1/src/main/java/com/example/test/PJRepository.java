package com.example.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PJRepository extends JpaRepository<Personaje, Long> {
	 List<Personaje> findByAtribute(String atribute);
	 List<Personaje> findByName(String name);
}

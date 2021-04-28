package com.example.test;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/*
@RestController
public class CalculatorRestController {
	@Autowired
	private EquipoRepository service;
	@PutMapping("/verEquipo/{id}")
	public ResponseEntity<Equipo> calcularEquipo(@PathVariable long id, @RequestBody Equipo updatedEquipo){
		if (service.existsById(id)) {
			updatedEquipo.setId(id);
			service.save(updatedEquipo);

			return new ResponseEntity<>(updatedEquipo, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

				
		}
		
}

*/
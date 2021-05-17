package com.example.test;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<User, Long>, JpaRepository<User, Long> {
	User findByUsername(String username);
	
	
}

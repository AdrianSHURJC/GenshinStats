package com.example.test;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
/*
public class DatabaseUsersLoader {
	@Autowired
	 private UsuarioRepository userRepository;
	
	  @Autowired
		private PasswordEncoder passwordEncoder;
	
	 @PostConstruct
	 private void initDatabase() {

	 userRepository.save(new User("user",passwordEncoder.encode("pass"),"ROLE_USER"));
	 userRepository.save(new User("admin",passwordEncoder.encode("adminpass"),"ROLE_USER","ROLE_ADMIN"));
	 }
}*/

package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public UsuarioRepositoryAuthenticationProvider authenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// URLs publicas
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/listaEquipo").permitAll();
	
		http.authorizeRequests().antMatchers("/verEquipo/{id}").permitAll();
		http.authorizeRequests().antMatchers("/generarPDF/{id}").permitAll();
	

		 
		// URls privadas
		
		 
		http.authorizeRequests().antMatchers("/private").hasAnyRole("USER");
		http.authorizeRequests().antMatchers("/borraEquipo").hasAnyRole("ADMIN");
		// Login
		
		http.formLogin().usernameParameter("username");
		http.formLogin().passwordParameter("password");
		http.formLogin().defaultSuccessUrl("/private");
		http.formLogin().failureUrl("/logerror");
		
		// Logout
		http.logout().logoutUrl("/logout");
		http.logout().logoutSuccessUrl("/");

		http.csrf().disable();
	    http.headers().frameOptions().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.authenticationProvider(authenticationProvider);
		
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

		auth.inMemoryAuthentication().withUser("user")
			.password(encoder.encode("pass")).roles("USER");

		auth.inMemoryAuthentication().withUser("admin")
			.password(encoder.encode("adminpass")).roles("USER", "ADMIN");
	}

}

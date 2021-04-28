package com.example.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ControllerLogin {
	
	private static final Logger log = LoggerFactory.getLogger(ControllerLogin.class);

	
	List<User> usuarios= new ArrayList<>();
	
	@Autowired
	private UserComponent userComponent;	
		
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	
	@Component
	@SessionScope
	public class UserComponent {

		private User user;

		public User getLoggedUser() {
			return user;
		}

		public void setLoggedUser(User user) {
			this.user = user;
		}

		public boolean isLoggedUser() {
			return this.user != null;
		}

	}
	
	@PostMapping("/private")
		public String private1(Model model) {
		return "success";
	}
	
	
	/*@GetMapping("/login")
	public String Signin(Model model, HttpServletRequest request) {
	
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth == null || auth instanceof AnonymousAuthenticationToken) {
			return "/login";	
		}
		return "redirect:/";
		
		
	}
	
		@GetMapping("/logout")
	public String logoutPage(Model model, HttpServletRequest request) {
		return "/";
	}
	*/
	
	@GetMapping("/signup")
	public String signupPage(Model model, HttpServletRequest request) {
		return "Signup";
	}
	@GetMapping("/borraEquipo")
	public String borraEquipo(Model model, HttpServletRequest request) {
		return "borraEquipo";
	}
	@GetMapping("/private")
	public String privatePage(Model model, HttpServletRequest request) {
		return "success";
	}

    
    @PostMapping("/nuevoUsuario")
    public String registrarse(Model model, @RequestParam String nombreUsuario,@RequestParam String contrasenya) {

        usuarioRepository.save(new User(nombreUsuario, contrasenya, "ROLE_USER"));
        
        return "redirect:/login";
    }


}
package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
@EnableCaching
@EnableRedisHttpSession
@SpringBootApplication
public class GenshinStatsApplication {
	//Prueba de GitHub Commit a la main branch 
	public static void main(String[] args) {
		SpringApplication.run(GenshinStatsApplication.class, args);
	}
	
}

package com.kenyi.apigenshin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication/* 
@EnableJpaRepositories(basePackages = "com.kenyi.Repository") 
@EntityScan(basePackages = "com.kenyi.Models") // Escanea el paquete donde está la entidad Personaje*/
public class ApigenshinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigenshinApplication.class, args);
	}

}

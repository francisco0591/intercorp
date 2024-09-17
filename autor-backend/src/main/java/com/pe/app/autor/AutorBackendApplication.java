package com.pe.app.autor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AutorBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutorBackendApplication.class, args);
	}

}

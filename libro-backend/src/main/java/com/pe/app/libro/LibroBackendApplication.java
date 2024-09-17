package com.pe.app.libro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LibroBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibroBackendApplication.class, args);
	}

}

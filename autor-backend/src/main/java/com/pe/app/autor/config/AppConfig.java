package com.pe.app.autor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Value("${spring.r2dbc.url}")
	private String url;
}

package com.pe.app.libro.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.pe.app.libro.handler.LibroHandler;

import lombok.extern.slf4j.Slf4j;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
@Configuration
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class LibroRouter {

	@Bean
	public RouterFunction<ServerResponse> routersUsuarios(LibroHandler libroHandler){
		return RouterFunctions
				.route(GET("/api/libro/listarTodo"), libroHandler::getAll)
				.andRoute(GET("/api/libro/buscarxid/{id}"), libroHandler::getById)
				.andRoute(POST("/api/libro/save"), libroHandler::save)
				.andRoute(PUT("/api/libro/update"), libroHandler::update)
				.andRoute(DELETE("/api/libro/delete/{id}"), libroHandler::delete);

	}
	
	
}

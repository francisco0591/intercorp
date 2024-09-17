package com.pe.app.autor.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.pe.app.autor.handler.AutorHandler;

import lombok.extern.slf4j.Slf4j;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class AutorRouter {

	@Bean
	public RouterFunction<ServerResponse> routersUsuarios(AutorHandler autorHandler){
		return RouterFunctions
				.route(GET("/api/autor/listarTodo"), autorHandler::getAll)
				.andRoute(GET("/api/autor/buscarxid/{id}"), autorHandler::getById)
				.andRoute(POST("/api/autor/save"), autorHandler::save)
				.andRoute(PUT("/api/autor/update"), autorHandler::update)
				.andRoute(DELETE("/api/autor/delete/{id}"), autorHandler::delete);

	}
	
	
}

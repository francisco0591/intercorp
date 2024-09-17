package com.pe.app.libro.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pe.app.libro.dto.AutorDTO;
import com.pe.app.libro.entities.Libro;
import com.pe.app.libro.service.LibroService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Component
@Slf4j
@RequiredArgsConstructor
public class LibroHandler {

	@Autowired
	private LibroService libroService;
	
	
	
	public Mono<ServerResponse> getAll(ServerRequest request){
		Flux<Libro> autors = libroService.getAll();
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(autors,Libro.class);
	}
	
	public Mono<ServerResponse> getById(ServerRequest request){
		long id = Long.valueOf(request.pathVariable("id"));
		Mono<Libro> autor = libroService.getById(id);
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(autor,Libro.class);

	}
	
	public Mono<ServerResponse> save(ServerRequest request){
		try {
				Mono<Libro> autor = request.bodyToMono(Libro.class);
				return autor.flatMap(p -> {
					try {
						return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
								.body(libroService.save(p),Libro.class);
					} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				});
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public Mono<ServerResponse> update(ServerRequest request){
		Mono<Libro> autor = request.bodyToMono(Libro.class);
		return autor.flatMap(p -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(libroService.update(p),Libro.class));

	}
	
	public Mono<ServerResponse> delete(ServerRequest request){
		long id = Long.valueOf(request.pathVariable("id"));
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(libroService.delete(id),Libro.class);

	}
}

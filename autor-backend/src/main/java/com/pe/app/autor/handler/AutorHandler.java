package com.pe.app.autor.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.pe.app.autor.entities.Autor;
import com.pe.app.autor.service.AutorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Component
@Slf4j
@RequiredArgsConstructor
public class AutorHandler {

	@Autowired
	private AutorService autorService;
	
	public Mono<ServerResponse> getAll(ServerRequest request){
		Flux<Autor> autors = autorService.getAll();
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(autors,Autor.class);
	}
	
	public Mono<ServerResponse> getById(ServerRequest request){
		int id = Integer.valueOf(request.pathVariable("id"));
		Mono<Autor> autor = autorService.getById(id);
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(autor,Autor.class);

	}
	
	public Mono<ServerResponse> save(ServerRequest request){
		Mono<Autor> autor = request.bodyToMono(Autor.class);
		return autor.flatMap(p -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(autorService.save(p),Autor.class));

	}
	
	public Mono<ServerResponse> update(ServerRequest request){
		Mono<Autor> autor = request.bodyToMono(Autor.class);
		return autor.flatMap(p -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(autorService.update(p),Autor.class));

	}
	
	public Mono<ServerResponse> delete(ServerRequest request){
		long id = Long.valueOf(request.pathVariable("id"));
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(autorService.delete(id),Autor.class);

	}
}

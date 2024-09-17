package com.pe.app.libro.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pe.app.libro.entities.Libro;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LibroService {

	Flux<Libro> getAll();
	Mono<Libro> getById(long id);
	Mono<Libro> save(Libro autor) throws JsonProcessingException;
	Mono<Libro> update(Libro autor);
	Mono<Void> delete(long id);
}

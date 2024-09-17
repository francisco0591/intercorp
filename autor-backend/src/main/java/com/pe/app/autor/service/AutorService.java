package com.pe.app.autor.service;

import com.pe.app.autor.entities.Autor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AutorService {

	Flux<Autor> getAll();
	Mono<Autor> getById(int id);
	Mono<Autor> save(Autor autor);
	Mono<Autor> update(Autor autor);
	Mono<Void> delete(long id);
}

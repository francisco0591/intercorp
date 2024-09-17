package com.pe.app.autor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pe.app.autor.entities.Autor;
import com.pe.app.autor.repository.AutorRepository;
import com.pe.app.autor.service.AutorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository autorRepository;
	
	@Override
	public Flux<Autor> getAll() {
		return autorRepository.findAll();
	}

	@Override
	public Mono<Autor> getById(int id) {
		return autorRepository.findById((long)id);
	}

	@Override
	public Mono<Autor> save(Autor autor) {
		return autorRepository.save(autor);
	}

	@Override
	public Mono<Autor> update(Autor autor) {
		
		return autorRepository.save(autor);
	}

	@Override
	public Mono<Void> delete(long id) {
		return autorRepository.deleteById(id);
	}

}

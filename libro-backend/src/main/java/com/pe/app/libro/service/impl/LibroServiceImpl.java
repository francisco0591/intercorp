package com.pe.app.libro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.pe.app.libro.dto.AutorDTO;
import com.pe.app.libro.entities.Libro;
import com.pe.app.libro.repository.LibroRepository;
import com.pe.app.libro.service.LibroService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private WebClient.Builder client;
	
	@Autowired
	private LibroRepository libroRepository;
	
	@Override
	public Flux<Libro> getAll() {
		return libroRepository.findAll();
	}

	@Override
	public Mono<Libro> getById(long id) {
		return libroRepository.findById(id);
	}

	@Override
	public Mono<Libro> save(Libro autor) throws JsonProcessingException {
			return libroRepository.save(autor);
	}

	@Override
	public Mono<Libro> update(Libro autor) {
		return libroRepository.save(autor);
	}

	@Override
	public Mono<Void> delete(long id) {
		return libroRepository.deleteById(id);
	}

}

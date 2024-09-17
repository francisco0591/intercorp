package com.pe.app.libro.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.app.libro.entities.Libro;

@Repository
public interface LibroRepository extends ReactiveCrudRepository<Libro, Long>{

}

package com.pe.app.autor.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.app.autor.entities.Autor;

@Repository
public interface AutorRepository extends ReactiveCrudRepository<Autor, Long>{

}

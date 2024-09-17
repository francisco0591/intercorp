CREATE TABLE IF NOT EXISTS Libro
(
  idlibro serial not null,
  titulo character varying,
  paginas character varying,
  fechapublicacion character varying,
  genero character varying,
  idautor integer,
  CONSTRAINT idlibro PRIMARY KEY (idlibro),
  foreign key (idautor)
  references Autor (idautor)
);


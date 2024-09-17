CREATE TABLE IF NOT EXISTS Autor
(
  idautor serial NOT NULL,
  nombre character varying,
  apellido character varying,
  nacionalidad character varying,
  fechanacimiento character varying,
  CONSTRAINT idautor PRIMARY KEY (idAutor)
);



package br.com.projeto.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.cursos.entities.Cursos;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
    

}

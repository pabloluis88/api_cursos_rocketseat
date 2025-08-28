package br.com.projeto.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.cursos.entities.Cursos;
import br.com.projeto.cursos.repository.CursosRepository;
import jakarta.transaction.Transactional;

@Service
public class CursosService {

    @Autowired
    private CursosRepository repository;

    @Transactional(rollbackOn = Exception.class)
    public Cursos save(Cursos curso) {
        return repository.save(curso);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<Cursos> findAll() {
        return repository.findAll();
    }

    
    

}

package br.com.projeto.cursos.service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Cursos> findById(Long id) {
        return repository.findById(id);   


    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void updateById(Long id, Cursos curso) {
        Optional<Cursos> existingCurso = repository.findById(id);
        if (existingCurso.isPresent()) {
            Cursos updatedCurso = existingCurso.get();
            updatedCurso.setName(curso.getName());
            updatedCurso.setCategory(curso.getCategory());
            updatedCurso.setActive(curso.getActive());
            updatedCurso.setUpdated_at(java.time.LocalDateTime.now());
            repository.save(updatedCurso);
        }
    }   

      

}

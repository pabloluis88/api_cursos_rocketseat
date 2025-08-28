package br.com.projeto.cursos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.cursos.entities.Cursos;
import br.com.projeto.cursos.service.CursosService;


@RestController
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursosService service;

    @PostMapping
    public ResponseEntity<Cursos> save(@RequestBody Cursos curso) {
        Cursos savedCurso = service.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCurso);
    }

    @GetMapping
    public ResponseEntity<List<Cursos>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cursos>> findById(@PathVariable Long id) {
        Optional<Cursos> curso = service.findById(id);
        return ResponseEntity.ok(curso);    
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();  
    }


    
    

}

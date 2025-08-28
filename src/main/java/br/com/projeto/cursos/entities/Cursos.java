package br.com.projeto.cursos.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cursos")
@Data
public class Cursos {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private Long id;
    
    private String name;
    private String category;
    private String active;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at;

    @UpdateTimestamp 
    @Column(name = "created_at")
    private LocalDateTime updated_at;



}

package com.biolab.cursos.repositories;

import com.biolab.cursos.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

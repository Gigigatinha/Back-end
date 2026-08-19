package com.biolab.escola.repositories;

import com.biolab.escola.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByNome(String nome);

}

// Classe responsável pela comunicação com o banco
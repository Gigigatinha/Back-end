package com.biolab.escola.services;

import com.biolab.escola.DTOs.AlunoRequest;
import com.biolab.escola.DTOs.AlunoResponse;
import com.biolab.escola.entities.Aluno;
import com.biolab.escola.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public AlunoResponse cadastrar(AlunoRequest request) {

        Aluno aluno = new Aluno();

        aluno.setNome(request.getNome());
        aluno.setTurma(request.getTurma());
        aluno.setNota(request.getNota());
        aluno.setDataCadastro(request.getDataCadastro());

        repository.save(aluno);

        return new AlunoResponse(
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurma(),
                aluno.getNota(),
                aluno.getDataCadastro()
        );
    }

    public List<AlunoResponse> listarTodos() {

        return repository.findAll()
                .stream()
                .map(aluno -> new AlunoResponse(
                        aluno.getId(),
                        aluno.getNome(),
                        aluno.getTurma(),
                        aluno.getNota(),
                        aluno.getDataCadastro()
                ))
                .collect(Collectors.toList());
    }

    public AlunoResponse buscarPorId(Long id) {

        Aluno aluno = repository.findById(id).orElseThrow();

        return new AlunoResponse(
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurma(),
                aluno.getNota(),
                aluno.getDataCadastro()
        );
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}


package com.biolab.escola.services;

import com.biolab.escola.DTOs.AlunoRequest;
import com.biolab.escola.DTOs.AlunoResponse;
import com.biolab.escola.entities.Aluno;
import com.biolab.escola.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public AlunoRequest criarAluno(AlunoRequest request) {
        Aluno aluno = new Aluno();
        aluno.setNome(request.getNome());
        aluno.setTurma(request.getTurma());
        aluno.setNota(request.getNota());
        aluno.setDataCadastro(request.getDataCadastro());
        alunoRepository.save(aluno);
        return request;
    }

    public List<AlunoResponse> mostrarAluno() {

        return alunoRepository.findAll().stream()
                .map(aluno -> new AlunoResponse(
                        aluno.getId(), aluno.getNome(),
                        aluno.getTurma(), aluno.getNota(), aluno.getDataCadastro()))
                .toList();
    }

    public AlunoResponse buscarID(Long id) {

        Aluno aluno = alunoRepository.findById(id).orElseThrow();

        return new AlunoResponse(
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurma(),
                aluno.getNota(),
                aluno.getDataCadastro()
        );
    }

    public String deletar(Long id) {
        alunoRepository.deleteById(id);
        return null;
    }
}


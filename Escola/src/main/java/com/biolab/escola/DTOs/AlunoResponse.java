package com.biolab.escola.DTOs;

import java.time.LocalDate;

// DTO utilizado para retornar os dados do aluno.
public class AlunoResponse {

    private final Long id;
    private final String nome;
    private final String turma;
    private final Double nota;
    private final LocalDate dataCadastro;

    public AlunoResponse(Long id, String nome, String turma,
                         Double nota, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public Double getNota() {
        return nota;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
}

// Classe usada para retornar os dados dos alunos
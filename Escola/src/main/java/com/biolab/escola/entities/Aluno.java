package com.biolab.escola.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String turma;

    private Double nota;

    private LocalDate dataCadastro = LocalDate.now();

    public Aluno() {
    }

    public Aluno(Long id, String nome, String turma,
                 Double nota, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.dataCadastro = dataCadastro;
    }

    public Aluno(String nome, String turma, Double nota, LocalDate dataCadastro) {
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
// Essa classe representa um aluno cadastrado no sistema, ela salva todas as informações colocadas dentro do código. Nesse caso seria o nome, id, tuma, nota e a data de cadastro de cada aluno

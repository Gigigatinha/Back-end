package com.biolab.todolist.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String nomeTarefa;
    private String data;
    private String descricao;
    @ManyToOne
    @NotNull
    private Usuario usuario;

    public Tarefa() {
    }

    public Tarefa(long id, String nomeTarefa, String data, String descricao, Usuario usuario) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
        this.data = data;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public Tarefa(String nomeTarefa, String data, String descricao, Usuario usuario) {
        this.nomeTarefa = nomeTarefa;
        this.data = data;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


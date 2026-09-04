package com.biolab.todolist.DTOs;

import jakarta.validation.constraints.NotNull;

public class TarefaRequest {

    @NotNull
    private String nomeTarefa;
    private String data;
    private String descricao;

    public TarefaRequest(){}

    public TarefaRequest(String nomeTarefa, String data, String descricao) {
        this.nomeTarefa = nomeTarefa;
        this.data = data;
        this.descricao = descricao;
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
}

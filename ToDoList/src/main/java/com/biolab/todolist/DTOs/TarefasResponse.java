package com.biolab.todolist.DTOs;

public class TarefasResponse {

    private long id;
    private String nome;
    private String data;
    private String descricao;

    public TarefasResponse(){
    }

    public TarefasResponse(long id, String nome, String data, String descricao) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

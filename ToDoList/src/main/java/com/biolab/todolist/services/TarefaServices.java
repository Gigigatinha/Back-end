package com.biolab.todolist.services;

import com.biolab.todolist.DTOs.TarefaRequest;
import com.biolab.todolist.DTOs.TarefasResponse;
import com.biolab.todolist.entities.Tarefa;
import com.biolab.todolist.repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaServices {

    private final TarefaRepository tarefaRepository;

    public TarefaServices(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public TarefaRequest criarTarefa(TarefaRequest request) {
        Tarefa tarefa = new Tarefa();

        tarefa.setNomeTarefa(request.getNomeTarefa());
        tarefa.setData(request.getData());
        tarefa.setDescricao(request.getDescricao());

        tarefaRepository.save(tarefa);

        return request;
    }

    public List<TarefasResponse> mostrarTarefa() {
        return tarefaRepository.findAll().stream()
                .map(tarefa -> new TarefasResponse(
                        tarefa.getId(),
                        tarefa.getNomeTarefa(),
                        tarefa.getData(),
                        tarefa.getDescricao()))
                .toList();
    }

    public TarefasResponse buscarID(long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);

        TarefasResponse tarefaResponse = new TarefasResponse();

        tarefaResponse.setId(tarefa.get().getId());
        tarefaResponse.setNome(tarefa.get().getNomeTarefa());
        tarefaResponse.setData(tarefa.get().getData());
        tarefaResponse.setDescricao(tarefa.get().getDescricao());

        return tarefaResponse;
    }

    public String deletar(long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);

        if (tarefa == null) {
            return "Tarefa não existe";
        } else {
            tarefaRepository.deleteById(id);
            return "Tarefa deletada";
        }
    }

    public String alterar(long id, TarefaRequest request) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow();

        tarefa.setNomeTarefa(request.getNomeTarefa());
        tarefa.setData(request.getData());
        tarefa.setDescricao(request.getDescricao());

        tarefaRepository.save(tarefa);

        return "ok";
    }
}
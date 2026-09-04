package com.biolab.todolist.controllers;

import com.biolab.todolist.DTOs.TarefaRequest;
import com.biolab.todolist.DTOs.TarefasResponse;
import com.biolab.todolist.services.TarefaServices;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

    private final TarefaServices tarefaService;

    public TarefaController(TarefaServices tarefaServices) {
        this.tarefaService = tarefaServices;
    }

    @PostMapping
    public ResponseEntity<?> criarTarefa(@Valid @RequestBody TarefaRequest req) {
        return ResponseEntity.ok("Criado com sucesso" + tarefaService.criarTarefa(req));
    }

    @GetMapping
    public ResponseEntity<List<TarefasResponse>> mostrar() {
        return ResponseEntity.ok(tarefaService.mostrarTarefa());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarTarefa(@PathVariable Long id) {
        return ResponseEntity.ok(tarefaService.buscarID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> apagarId(@PathVariable Long id) {
        return ResponseEntity.ok(tarefaService.deletar(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(
            @PathVariable Long id,
            @RequestBody TarefaRequest request) {

        return ResponseEntity.ok(tarefaService.alterar(id, request));
    }
}

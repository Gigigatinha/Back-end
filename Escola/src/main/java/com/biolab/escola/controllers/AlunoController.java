package com.biolab.escola.controllers;

import com.biolab.escola.DTOs.AlunoRequest;
import com.biolab.escola.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;
    public AlunoController(AlunoService alunoService) { this.alunoService = alunoService;}
    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody AlunoRequest dto) { return ResponseEntity.ok(alunoService.cadastrar(dto));}

    @GetMapping
    public ResponseEntity<?> listarTodos() { return ResponseEntity.ok(alunoService.listarTodos());}

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) { return ResponseEntity.ok(alunoService.buscarPorId(id));}

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) { alunoService.deletar(id);return ResponseEntity.ok("Aluno excluído com sucesso!");}
}

// Classe responsável por receber os pedidos (requisições) feitos pelo usuário.
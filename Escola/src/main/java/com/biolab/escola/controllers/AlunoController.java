package com.biolab.escola.controllers;

import com.biolab.escola.DTOs.AlunoRequest;
import com.biolab.escola.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public ResponseEntity<?> criarAluno(@RequestBody AlunoRequest request) {

        return ResponseEntity.ok(
                alunoService.criarAluno(request)
        );
    }

    @GetMapping
    public ResponseEntity<?> mostrarAluno() {

        return ResponseEntity.ok(
                alunoService.mostrarAluno()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarID(@PathVariable Long id) {

        return ResponseEntity.ok(
                alunoService.buscarID(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {

        return ResponseEntity.ok(
                alunoService.deletar(id)
        );
    }
}

// Classe responsável por receber os pedidos (requisições) feitos pelo usuário
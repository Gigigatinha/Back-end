package com.biolab.todolist.controllers;

import com.biolab.todolist.DTOs.UsuarioRequest;
import com.biolab.todolist.DTOs.UsuarioResponse;
import com.biolab.todolist.services.UsuarioServices;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioServices usuarioService;

    public UsuarioController(UsuarioServices usuarioServices) {
        this.usuarioService = usuarioServices;
    }

    @PostMapping
    public ResponseEntity<?> criarUsuario(@Valid @RequestBody UsuarioRequest req) {
        return ResponseEntity.ok("Criado com sucesso" + usuarioService.criarUsuario(req));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> mostrar() {
        return ResponseEntity.ok(usuarioService.mostrarUsuario());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> apagarId(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.deletar(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(
            @PathVariable Long id,
            @RequestBody UsuarioRequest request) {

        return ResponseEntity.ok(usuarioService.alterar(id, request));
    }
}
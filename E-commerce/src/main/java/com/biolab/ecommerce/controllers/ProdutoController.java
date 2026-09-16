package com.biolab.ecommerce.controllers;

import com.biolab.ecommerce.DTO.ProdutoDTO;
import com.biolab.ecommerce.services.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?> criarProduto(@Valid @RequestBody ProdutoDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(dto));
    }

    //xxx
    @GetMapping
    public ResponseEntity<?> mostrarProduto(){
        return ResponseEntity.ok().body(service.mostrarProduto());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProduto(@PathVariable long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterarProduto(@PathVariable long id, @Valid @RequestBody ProdutoDTO dto){
        return ResponseEntity.ok().body(service.alterar(id,  dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable long id){
        return ResponseEntity.ok().body(service.deletar(id));
    }

}
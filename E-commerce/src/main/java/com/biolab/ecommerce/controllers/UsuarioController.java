package com.biolab.ecommerce.controllers;
import com.biolab.ecommerce.DTO.UsuarioDTO;
import com.biolab.ecommerce.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioService services;
    public UsuarioController(UsuarioService services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDTO dto){
        return ResponseEntity.ok(services.criar(dto));
    }
}
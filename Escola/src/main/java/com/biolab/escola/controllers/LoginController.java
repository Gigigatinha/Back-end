package com.biolab.escola.controllers;

import com.biolab.escola.DTOs.LoginDTO;
import com.biolab.escola.services.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public String login(@RequestBody LoginDTO loginDTO) {

        if (service.autenticar(loginDTO)) {
            return "Login realizado com sucesso!";
        }

        return "Usuário ou senha inválidos!";
    }
}

// Essa classe é responsável pelo login

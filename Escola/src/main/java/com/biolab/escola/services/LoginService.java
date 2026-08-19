package com.biolab.escola.services;

import com.biolab.escola.DTOs.LoginDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean autenticar(LoginDTO loginDTO) {

        return loginDTO.getUsuario().equals("admin")
                && loginDTO.getSenha().equals("123");
    }
}

// Classe responsável pela segurança para verificar e confirmar a identidade do aluno
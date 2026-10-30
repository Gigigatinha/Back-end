package com.biolab.security.services;

import com.biolab.security.dto.UsuarioDTO;
import com.biolab.security.entities.Usuario;
import com.biolab.security.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;
    public UsuarioService(UsuarioRepository repo){
        this.repo = repo;
    }

    public Usuario saveUser(UsuarioDTO dto){
        Usuario u = new Usuario();
        u.setNome(dto.getNome());
        u.setEmail(dto.getEmail());
        u.setSenha(dto.getSenha());
        u.setRole(dto.getRole());
        repo.save(u);
        return u;
    }
}

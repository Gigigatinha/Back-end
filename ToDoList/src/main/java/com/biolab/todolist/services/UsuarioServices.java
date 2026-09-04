package com.biolab.todolist.services;

import com.biolab.todolist.DTOs.UsuarioRequest;
import com.biolab.todolist.DTOs.UsuarioResponse;
import com.biolab.todolist.entities.Usuario;
import com.biolab.todolist.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServices {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioRequest criarUsuario(UsuarioRequest request) {
        Usuario usuario = new Usuario();

        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());

        usuarioRepository.save(usuario);

        return request;
    }

    public List<UsuarioResponse> mostrarUsuario() {
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioResponse(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail()))
                .toList();
    }

    public List<UsuarioResponse> mostrarUsuario2() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UsuarioResponse> listResponse = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            UsuarioResponse usuarioResponse1 = new UsuarioResponse(
                    usuario.getId(),
                    usuario.getNome(),
                    usuario.getEmail()
            );

            listResponse.add(usuarioResponse1);
        }

        return listResponse;
    }

    public UsuarioResponse buscarID(long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        UsuarioResponse usuarioResponse = new UsuarioResponse();

        usuarioResponse.setId(usuario.get().getId());
        usuarioResponse.setNome(usuario.get().getNome());
        usuarioResponse.setEmail(usuario.get().getEmail());

        return usuarioResponse;
    }

    public String deletar(long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario == null) {
            return "Usuario não existe";
        } else {
            usuarioRepository.deleteById(id);
            return "Usuario deletado";
        }
    }

    public String alterar(long id, UsuarioRequest request) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();

        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());

        usuarioRepository.save(usuario);

        return "ok";
    }
}

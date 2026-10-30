package com.biolab.security.repositories;

import com.biolab.security.entities.Usuario;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Id>{

}

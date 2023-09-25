package com.juhmaran.simplecrud.usuario.repository;

import com.juhmaran.simplecrud.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

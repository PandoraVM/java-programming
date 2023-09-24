package com.juhmaran.myproject.projectinitial.repository;

import com.juhmaran.myproject.projectinitial.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}

package com.juhmaran.simplecrud.usuario.rest;

import com.juhmaran.simplecrud.usuario.domain.Usuario;
import com.juhmaran.simplecrud.usuario.repository.UsuarioRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listUser() {
        return usuarioRepository.findAll();
    }

    @PostMapping(value = "/register")
    public Usuario addUser(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping(value = "/{id}")
    public Usuario getUser(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "/{id}/edit")
    public Usuario editUser(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping(value = "/{id}/delete")
    public void deleteUser(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }

}

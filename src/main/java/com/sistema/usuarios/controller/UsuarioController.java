package com.sistema.usuarios.controller;

import com.sistema.usuarios.entity.Usuario;
import com.sistema.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/guardar")
    public ResponseEntity<?> guardarUsuario(@RequestBody Usuario usuario) {

        Optional<Usuario> userExist = usuarioService.buscarUsuarioPorEmail(usuario.getEmail());
        if (userExist.isPresent()) {
            return ResponseEntity.ok("Usuario ya existe, pruebe con otro email.");
        }

        return ResponseEntity.ok(usuarioService.guardarUsuario(usuario));
    }
}

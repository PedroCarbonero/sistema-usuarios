package com.sistema.usuarios.controller;

import com.sistema.usuarios.dto.UsuarioDto;
import com.sistema.usuarios.entity.Usuario;
import com.sistema.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
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

        Usuario usuarioNuevo = usuarioService.guardarUsuario(usuario);

        return ResponseEntity.ok(usuarioNuevo);
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarUsuarios() {
        List<UsuarioDto> usuarioDtosList = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuarioDtosList);
    }


}

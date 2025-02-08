package com.sistema.usuarios.service;


import com.sistema.usuarios.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario);
    public Optional<Usuario> buscarUsuarioPorEmail(String email);
    public List<Usuario> listarUsuarios();
    public void eliminarUsuario(Integer id);
}

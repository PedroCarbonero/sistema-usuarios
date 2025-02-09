package com.sistema.usuarios.service;


import com.sistema.usuarios.dto.UsuarioDto;
import com.sistema.usuarios.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario);
    public Optional<Usuario> buscarUsuarioPorEmail(String email);
    public List<UsuarioDto> listarUsuarios();
    public void eliminarUsuario(Integer id);
    public void cambiarEstadoUsuario(Integer id);
}

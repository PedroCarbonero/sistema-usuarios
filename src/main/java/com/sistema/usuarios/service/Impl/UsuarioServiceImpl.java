package com.sistema.usuarios.service.Impl;

import com.sistema.usuarios.entity.Usuario;
import com.sistema.usuarios.repository.UsuarioRepository;
import com.sistema.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> buscarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void eliminarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}

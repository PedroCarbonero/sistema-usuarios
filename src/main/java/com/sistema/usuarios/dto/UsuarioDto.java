package com.sistema.usuarios.dto;

public class UsuarioDto {
    private String nombre;
    private String apellido;
    private String email;
    private boolean estado;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String apellido, String email, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

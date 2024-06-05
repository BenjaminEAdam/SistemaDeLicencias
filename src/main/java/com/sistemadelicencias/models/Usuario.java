package com.sistemadelicencias.models;

public class Usuario {
    private String correoElectronico;
    private String nombreDeUsuario;
    private String rol;

    public Usuario(String correoElectronico, String nombreDeUsuario, String rol) {
        this.correoElectronico = correoElectronico;
        this.nombreDeUsuario = nombreDeUsuario;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}

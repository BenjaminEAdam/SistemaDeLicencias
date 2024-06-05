package com.sistemadelicencias.models;

public class Usuario {
    private String correoElectronico;
    private String nombreDeUsuario;
    private String contrasenia;
    private String permisos;

    public Usuario(String correoElectronico, String nombreDeUsuario, String permisos, String contrasenia) {
        this.correoElectronico = correoElectronico;
        this.nombreDeUsuario = nombreDeUsuario;
        this.permisos = permisos;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
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

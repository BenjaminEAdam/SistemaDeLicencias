package com.sistemadelicencias.models;

public class Usuario {
    private int id;
    private String correoElectronico;
    private String nombreDeUsuario;
    private String contrasenia;
    private String permisos;

    public Usuario(int id, String correoElectronico, String nombreDeUsuario, String contrasenia, String permisos) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasenia = contrasenia;
        this.permisos = permisos;
    }

    public Usuario(String correoElectronico, String nombreDeUsuario, String contrasenia, String permisos) {
        this.correoElectronico = correoElectronico;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasenia = contrasenia;
        this.permisos = permisos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

package com.sistemadelicencias.models;

import java.time.LocalDate;

public class Titular {
    private String nroDocumento;
    private String tipoDocumento;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;
    private Character claseSolicitada;
    private Character grupoSanguineo;
    private Character factorRH;
    private Boolean esDonante;

    public Titular(
            String nroDocumento,
            String tipoDocumento,
            String apellido,
            String nombre,
            LocalDate fechaNacimiento,
            String direccion,
            Character claseSolicitada,
            Character grupoSanguineo,
            Character factorRH,
            Boolean esDonante
    ) {
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.claseSolicitada = claseSolicitada;
        this.grupoSanguineo = grupoSanguineo;
        this.factorRH = factorRH;
        this.esDonante = esDonante;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getClaseSolicitada() {
        return claseSolicitada;
    }

    public void setClaseSolicitada(Character claseSolicitada) {
        this.claseSolicitada = claseSolicitada;
    }

    public Character getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(Character grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Character getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(Character factorRH) {
        this.factorRH = factorRH;
    }

    public Boolean getEsDonante() {
        return esDonante;
    }

    public void setEsDonante(Boolean esDonante) {
        this.esDonante = esDonante;
    }
}

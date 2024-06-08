package com.sistemadelicencias.service;

import com.sistemadelicencias.models.Usuario;

import java.sql.SQLException;

public interface UsuarioService {

    // Por ahora void
    // Ver que retornar después
    void createUsuario(Usuario usuario) throws SQLException;
    void updateUsuario(Usuario usuario) throws SQLException;
    Usuario getUsuarioById(int id) throws SQLException;
    Usuario getUsuarioByCorreoElectronico(String correoElectronico) throws SQLException;
}

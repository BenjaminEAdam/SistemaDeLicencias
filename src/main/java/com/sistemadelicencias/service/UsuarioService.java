package com.sistemadelicencias.service;

import com.sistemadelicencias.models.Usuario;

import java.sql.SQLException;

public interface UsuarioService {

    // Por ahora void
    // Ver que retornar después
    void createUsuario(Usuario usuario) throws SQLException;
}

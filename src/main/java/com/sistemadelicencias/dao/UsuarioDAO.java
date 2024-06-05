package com.sistemadelicencias.dao;

import com.sistemadelicencias.models.Usuario;

import java.sql.SQLException;

public interface UsuarioDAO {

    // Por ahora void
    // Ver que retornar después
    void create(Usuario usuario) throws SQLException;
}

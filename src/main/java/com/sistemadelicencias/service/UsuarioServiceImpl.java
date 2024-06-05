package com.sistemadelicencias.service;

import com.sistemadelicencias.dao.UsuarioDAO;
import com.sistemadelicencias.dao.UsuarioDAOImpl;
import com.sistemadelicencias.models.Usuario;

import java.sql.SQLException;

public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    // Por ahora void
    // Ver que retornar después
    @Override
    public void createUsuario(Usuario usuario) throws SQLException {
        usuarioDAO.create(usuario);
    }
}

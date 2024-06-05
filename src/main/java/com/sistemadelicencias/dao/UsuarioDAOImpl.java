package com.sistemadelicencias.dao;

import com.sistemadelicencias.DatabaseConnection;
import com.sistemadelicencias.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAOImpl implements UsuarioDAO{

    // Por ahora void
    // Ver que retornar después
    @Override
    public void create(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuarios (correoElectronico, nombreDeUsuario, rol) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, usuario.getCorreoElectronico());
            stmt.setString(2, usuario.getNombreDeUsuario());
            stmt.setString(3, usuario.getRol());
            stmt.executeUpdate();
        }
    }
}

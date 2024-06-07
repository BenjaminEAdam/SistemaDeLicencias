package com.sistemadelicencias.dao;

import com.sistemadelicencias.DatabaseConnection;
import com.sistemadelicencias.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAOImpl implements UsuarioDAO{

    // Por ahora void
    // Ver que retornar después
    @Override
    public void create(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuarios (correoElectronico, nombreDeUsuario, contrasenia, permisos) VALUES (?, ?, ?, ?)";
        try (   Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS))
        {
            stmt.setString(1, usuario.getCorreoElectronico());
            stmt.setString(2, usuario.getNombreDeUsuario());
            stmt.setString(3, usuario.getContrasenia());
            stmt.setString(4, usuario.getPermisos());
            stmt.executeUpdate();
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    usuario.setId(generatedKeys.getInt(1));
                }
            }
        }
    }

    // Por ahora retorna null
    // Ver si retornar alguna excepción
    @Override
    public Usuario getUsuarioById(int id) throws SQLException {
        Usuario usuario = null;
        String query = "SELECT * FROM usuarios WHERE id = ?";
        try (   Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query))
        {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("correoElectronico"), rs.getString("nombreDeUsuario"), rs.getString("contrasenia"), rs.getString("permisos"));
            }
        }
        return usuario;
    }

    @Override
    public Usuario getUsuarioByCorreoElectronico(String correoElectronico) throws SQLException {
        Usuario usuario = null;
        String query = "SELECT * FROM usuarios WHERE correoElectronico = ?";
        try (   Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query))
        {
            stmt.setString(1, correoElectronico);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getString("correoElectronico"), rs.getString("nombreDeUsuario"), rs.getString("contrasenia"), rs.getString("permisos"));
            }
        }
        return usuario;
    }
}

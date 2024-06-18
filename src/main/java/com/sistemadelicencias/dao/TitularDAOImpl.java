package com.sistemadelicencias.dao;

import com.sistemadelicencias.DatabaseConnection;
import com.sistemadelicencias.models.Titular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TitularDAOImpl implements TitularDAO {
    @Override
    public void create(Titular titular) throws SQLException {
        String query = "INSERT INTO titular (nroDocumento, tipoDocumento, apellido, nombre, fechaNacimiento, direccion, claseSolicitada, grupoSanguineo, factorRH, esDonante) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS))
        {
            stmt.setString(1, titular.getNroDocumento());
            stmt.setString(2, titular.getTipoDocumento());
            stmt.setString(3, titular.getApellido());
            stmt.setString(4, titular.getNombre());
            stmt.setString(5, titular.getFechaNacimiento().toString());
            stmt.setString(6, titular.getDireccion());
            stmt.setString(7, titular.getClaseSolicitada().toString());
            stmt.setString(8, titular.getGrupoSanguineo().toString());
            stmt.setString(9, titular.getFactorRH().toString());
            stmt.setString(10, titular.getEsDonante().toString());
            stmt.executeUpdate();
        }
    }

    @Override
    public Titular getUsuarioByNroDocumento(String nroDocumento) throws SQLException {
        return null;
    }
}

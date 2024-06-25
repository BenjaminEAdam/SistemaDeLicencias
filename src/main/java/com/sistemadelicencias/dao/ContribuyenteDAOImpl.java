package com.sistemadelicencias.dao;

import com.sistemadelicencias.DatabaseConnection;
import com.sistemadelicencias.models.Contribuyente;
import com.sistemadelicencias.models.Titular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ContribuyenteDAOImpl implements ContribuyenteDAO {

    @Override
    public Contribuyente getContribuyenteByNroDocumento(String nroDocumento) throws SQLException {
        Contribuyente contribuyente = null;
        String query = "SELECT * FROM contribuyente WHERE nroDocumento = ?";
        try (   Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query))
        {
            stmt.setString(1, nroDocumento);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nroDocumento2 = rs.getString("nroDocumento");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                LocalDate fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento")); // Assuming default format
                String direccion = rs.getString("direccion");

                return new Contribuyente(
                        nroDocumento2,
                        apellido,
                        nombre,
                        fechaNacimiento,
                        direccion
                );
            }
        }
        return contribuyente;
    }
}

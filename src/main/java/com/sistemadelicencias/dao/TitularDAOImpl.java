package com.sistemadelicencias.dao;

import com.sistemadelicencias.DatabaseConnection;
import com.sistemadelicencias.models.Titular;
import com.sistemadelicencias.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

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
        Titular titular = null;
        String query = "SELECT * FROM titular WHERE nroDocumento = ?";
        try (   Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query))
        {
            stmt.setString(1, nroDocumento);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nroDocumento2 = rs.getString("nroDocumento");
                String tipoDocumento = rs.getString("tipoDocumento");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                LocalDate fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento")); // Assuming default format
                String direccion = rs.getString("direccion");

                String claseSolicitadaString = rs.getString("claseSolicitada");
                Character claseSolicitada = null;
                if (claseSolicitadaString != null && !claseSolicitadaString.isEmpty()) {
                    claseSolicitada = claseSolicitadaString.charAt(0);
                }

                String grupoSanguineoString = rs.getString("grupoSanguineo");
                Character grupoSanguineo = null;
                if (grupoSanguineoString != null && !grupoSanguineoString.isEmpty()) {
                    grupoSanguineo = grupoSanguineoString.charAt(0);
                }

                String factorRHString = rs.getString("factorRH");
                Character factorRH = null;
                if (factorRHString != null && !factorRHString.isEmpty()) {
                    factorRH = factorRHString.charAt(0);
                }

                Boolean esDonante = rs.getBoolean("esDonante");

                return new Titular(
                        nroDocumento2,
                        tipoDocumento,
                        apellido,
                        nombre,
                        fechaNacimiento,
                        direccion,
                        claseSolicitada,
                        grupoSanguineo,
                        factorRH,
                        esDonante
                );
            }
        }
        return titular;
    }
}

package com.sistemadelicencias.dao;

import com.sistemadelicencias.models.Titular;

import java.sql.SQLException;

public interface TitularDAO {
    // Por ahora void
    // Ver que retornar después
    void create(Titular titular) throws SQLException;
    Titular getUsuarioByNroDocumento(String nroDocumento) throws SQLException;
}

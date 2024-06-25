package com.sistemadelicencias.dao;

import com.sistemadelicencias.models.Contribuyente;

import java.sql.SQLException;

public interface ContribuyenteDAO {
    Contribuyente getContribuyenteByNroDocumento(String nroDocumento) throws SQLException;
}

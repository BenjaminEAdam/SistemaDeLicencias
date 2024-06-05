package com.sistemadelicencias.service;

import com.sistemadelicencias.dao.UsuarioDAO;
import com.sistemadelicencias.dao.UsuarioDAOImpl;
import com.sistemadelicencias.models.Usuario;

import java.sql.SQLException;
import java.util.regex.Pattern;

public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    // Por ahora void
    // Ver que retornar después
    @Override
    public void createUsuario(Usuario usuario) throws SQLException {
        this.validateUsuario(usuario);
        // Falta validar que no exista en la db un usuario con este correo
        usuarioDAO.create(usuario);
    }


    private void validateUsuario(Usuario usuario) {
        if (usuario.getCorreoElectronico() == null || usuario.getCorreoElectronico().isEmpty()) {
            throw new IllegalArgumentException("El correo electrónico es requerido.");
        }

        if (!isValidEmail(usuario.getCorreoElectronico())) {
            throw new IllegalArgumentException("El correo electrónico no tiene un formato válido.");
        }

        if (usuario.getNombreDeUsuario() == null || usuario.getNombreDeUsuario().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario es requerido.");
        }

        if (usuario.getRol() == null || usuario.getRol().isEmpty()) {
            throw new IllegalArgumentException("El rol es requerido.");
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }
}

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
        if (usuarioDAO.getUsuarioByCorreoElectronico(usuario.getCorreoElectronico()) != null) {
            throw new IllegalArgumentException("El correo electrónico ya está en uso.");
        }
        usuarioDAO.create(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) throws SQLException {
        this.validateUsuario(usuario);
        if (usuarioDAO.getUsuarioByCorreoElectronico(usuario.getCorreoElectronico()) != null) {
            throw new IllegalArgumentException("El correo electrónico ya está en uso.");
        }
        usuarioDAO.update(usuario);
    }

    @Override
    public Usuario getUsuarioById(int id) throws SQLException {
        return usuarioDAO.getUsuarioById(id);
    }

    @Override
    public Usuario getUsuarioByCorreoElectronico(String correoElectronico) throws SQLException {
        if (!isValidEmail(correoElectronico)) {
            throw new IllegalArgumentException("El correo electrónico no tiene un formato válido.");
        }
        return usuarioDAO.getUsuarioByCorreoElectronico(correoElectronico);
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

        if (usuario.getContrasenia() == null || usuario.getContrasenia().isEmpty()) {
            throw new IllegalArgumentException("La contrasenia es requerida.");
        }

        if (usuario.getPermisos() == null || usuario.getPermisos().isEmpty()) {
            throw new IllegalArgumentException("Los permisos son requeridos.");
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }
}

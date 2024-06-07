package com.sistemadelicencias.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onPrintButtonClick() {
        welcomeText.setText("Imprimiendo licencia...");
        // this.probarCrearUsuario();
    }

    @FXML
    protected void onCancelButtonClick(ActionEvent event) {
        // Obtener el Stage a partir del nodo que disparó el evento
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Cerrar la ventana
        stage.close();
    }

}
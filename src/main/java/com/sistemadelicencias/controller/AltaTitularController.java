package com.sistemadelicencias.controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class AltaTitularController extends Application {

    @FXML
    private TextField nombreTextField;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/sistemadelicencias/views/AltaTitular.fxml"));

        Parent root = fxmlLoader.load();

        // Crear una escena
        Scene scene = new Scene(root, 1366,768  );
        //scene.getStylesheets().add(getClass().getResource("/com/sistemadelicencias/views/styles.css").toExternalForm());


        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Aplicación JavaFX");

        // Mostrar el escenario
        primaryStage.show();


    }

    @FXML
    public void botonValidar() {
        nombreTextField.setDisable(false);

    }
    @FXML
    private void botonCancelar() {
        // Lógica para manejar el evento de cancelación
        System.out.println("Cancel button clicked!");
    }
}

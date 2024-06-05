package com.sistemadelicencias.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PantallaHomeController extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/sistemadelicencias/views/PantallaHomeController.fxml"));

        Parent root = fxmlLoader.load();

        // Crear una escena
        Scene scene = new Scene(root, 1366,768  );
        scene.getStylesheets().add(getClass().getResource("/com/sistemadelicencias/views/styles.css").toExternalForm());


        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Aplicación JavaFX");

        // Mostrar el escenario
        primaryStage.show();


    }


    public void botonModificarTitular(ActionEvent actionEvent) {
    }

    public void botonAltaTitular(ActionEvent actionEvent) {
    }

    public void botonInformesLicencia(ActionEvent actionEvent) {
    }

    public void botonRenovarLicencia(ActionEvent actionEvent) {
    }

    public void botonEmitirLicencia(ActionEvent actionEvent) {
    }

    public void botonAltaUsuario(ActionEvent actionEvent) {
    }

    public void botonModificarUsuario(ActionEvent actionEvent) {
    }
}

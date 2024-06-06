package com.sistemadelicencias.controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class AltaTitularController extends Application {

    @FXML
    private ComboBox<String> tipoDocComboBox;

    @FXML
    private TextField numeroDocumentoTextField;

    @FXML
    private Label tipodoclabel;

    @FXML
    private Label nrodoclabel;

    @FXML
    private Label nombrelabel;

    @FXML
    private Label apellidolabel;

    @FXML
    private Label fechanacimientolabel;

    @FXML
    private Label direccionlabel;

    @FXML
    private Label clasesolicitadalabel;

    @FXML
    private Label gruposanguineolabel;

    @FXML
    private Label factorrhlabel;

    @FXML
    private TextField nombreTextField;

    @FXML
    private ComboBox<String> claseSolicitada;

    @FXML
    private ComboBox<String> factorRH;

    @FXML
    private DatePicker fechaNacimiento;

    @FXML
    private TextField apellido;

    @FXML
    private TextField direccion;

    @FXML
    private ComboBox<String> gruposanguineo;

    @FXML
    private CheckBox donante;

    @FXML
    private Button confirmarbutton;

    @FXML
    private Button cancelarbutton;
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


        //En realidad este no es el comportamiento que debería tener, sino que se deberían traer los datos de ser validos, los campos pueden permanecer deshabilitados
        if(true) {
            nombreTextField.setDisable(false);
            apellido.setDisable(false);
            claseSolicitada.setDisable(false);
            factorRH.setDisable(false);
            fechaNacimiento.setDisable(false);
            direccion.setDisable(false);
            gruposanguineo.setDisable(false);
            donante.setDisable(false);
            confirmarbutton.setDisable(false);
            cancelarbutton.setDisable(false);
            nombrelabel.setDisable(false);
            apellidolabel.setDisable(false);
            fechanacimientolabel.setDisable(false);
            direccionlabel.setDisable(false);
            clasesolicitadalabel.setDisable(false);
            gruposanguineolabel.setDisable(false);
            factorrhlabel.setDisable(false);
        }

    }
    @FXML
    private void botonCancelar() {
        // Lógica para manejar el evento de cancelación
        System.out.println("Cancel button clicked!");
    }
}

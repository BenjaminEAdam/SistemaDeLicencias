package com.sistemadelicencias.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopUpController extends Application {

    public Button botonAceptar;
    @FXML
    private Text mensaje;


    private Stage popupStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        abrirPopup("Error. Lorem, ipsum dolor sit amet consectetur adipisicing elit. Similique dicta numquam nemo quisquam, asperiores ad aliquid incidunt voluptas quod obcaecati ut, eligendi natus voluptatibus maiores, ducimus officia sunt repudiandae. Ratione.! Este es el mensaje del popup.");
    }

    public void abrirPopup(String unMensaje) {
        try {
            // Cargar el FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/sistemadelicencias/views/PopUp.fxml"));
            Parent root = loader.load();

            // Obtener el controlador y pasarle el mensaje
            PopUpController controller = loader.getController();
            controller.setMensaje(unMensaje);


            // Configurar la ventana del popup
            popupStage = new Stage();
            controller.setPopupStage(popupStage);// Aquí creas un nuevo Stage
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Error");
            popupStage.setScene(new Scene(root));
            popupStage.showAndWait(); // Y aquí muestras el nuevo Stage

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMensaje(String mensajeTexto) {
        if (mensaje != null) {
            mensaje.setText(mensajeTexto);
        }
    }

    public void setPopupStage(Stage popupStage) {
        this.popupStage = popupStage;
    }

    public void botonAceptar(ActionEvent actionEvent) {

        if (popupStage != null) {
            popupStage.close();
        }

    }

    public void initialize() {

    }

}



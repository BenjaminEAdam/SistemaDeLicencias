module com.example.sistemadelicencias {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.sistemadelicencias to javafx.fxml;
    exports com.sistemadelicencias;
    exports com.sistemadelicencias.controller;
    opens com.sistemadelicencias.controller to javafx.fxml;
}
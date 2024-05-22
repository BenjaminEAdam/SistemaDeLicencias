module com.example.sistemadelicencias {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.sistemadelicencias to javafx.fxml;
    exports com.example.sistemadelicencias;
}
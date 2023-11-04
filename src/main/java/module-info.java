module proyecto.gestioncontacto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens proyecto.gestioncontacto to javafx.fxml;
    exports proyecto.gestioncontacto;
}

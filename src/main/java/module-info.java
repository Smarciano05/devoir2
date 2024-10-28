module sio.gestionsuivimedical {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports sio.gestionsuivimedical.models;
    opens sio.gestionsuivimedical to javafx.fxml;
    exports sio.gestionsuivimedical;
    exports sio.gestionsuivimedical.services;
}
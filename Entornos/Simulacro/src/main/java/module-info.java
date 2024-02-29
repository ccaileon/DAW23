module com.example.simulacro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulacro to javafx.fxml;
    exports com.example.simulacro;
}
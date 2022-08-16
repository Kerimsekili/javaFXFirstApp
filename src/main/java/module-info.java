module com.jmc.javafxfirstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.javafxfirstapp to javafx.fxml;
    exports com.jmc.javafxfirstapp;
}
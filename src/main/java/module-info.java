module com.example.practica1_layouts_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica1_layouts_javafx to javafx.fxml;
    exports com.example.practica1_layouts_javafx;
}
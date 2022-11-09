module com.example.laba333 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba333 to javafx.fxml;
    exports com.example.laba333;
}
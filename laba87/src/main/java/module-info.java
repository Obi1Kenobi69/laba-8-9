module com.example.laba87 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba87 to javafx.fxml;
    exports com.example.laba87;
}
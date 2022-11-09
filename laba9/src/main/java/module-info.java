module com.example.laba9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba9 to javafx.fxml;
    exports com.example.laba9;
}
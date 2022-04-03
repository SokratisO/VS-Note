module com.vsnote.vsnote {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vsnote.vsnote to javafx.fxml;
    exports com.vsnote.vsnote;
}
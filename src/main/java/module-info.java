module com.example.universities_list {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens com.example.universities_list to javafx.fxml, com.google.gson;
    exports com.example.universities_list;
}
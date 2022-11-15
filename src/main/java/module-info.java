module com.example.universities_list {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.universities_list to javafx.fxml;
    exports com.example.universities_list;
}
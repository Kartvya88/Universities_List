package com.example.universities_list;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListsController implements Initializable {

    @FXML
    private Label messageSection;

    @FXML
    private ListView<Uni> resultsBoxSection;

    @FXML
    private Button searchButton;

    @FXML
    private TextField textFieldSection;

    @FXML
    private Button websiteButton;

    @FXML
    void search(ActionEvent actionEvent) throws IOException, InterruptedException {

        APIUtility.getUniversitiesList(textFieldSection.getText());
        APIResponse apiResponse = APIUtility.getUniversitiesListFromFile()[100];
        resultsBoxSection.getItems().addAll(apiResponse.getContentAsList());

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}

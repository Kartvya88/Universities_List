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
import java.util.Arrays;
import java.util.Collections;
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
    private Button detailsButton;

    @FXML
    void details(ActionEvent event) throws IOException {
        Uni uni = resultsBoxSection.getSelectionModel().getSelectedItem();
        SceneChanger.changeScenes(event,"details-view.fxml", uni.toString() );
    }

    @FXML
    void search(ActionEvent actionEvent) throws IOException, InterruptedException {


        APIUtility.getUniversitiesList(textFieldSection.getText());
        Uni[] uni = APIUtility.getUniversitiesListFromFile();
            resultsBoxSection.getItems().addAll(uni);
            resultsBoxSection.setVisible(true);
            messageSection.setVisible(true);
            resultsBoxSection.getItems().clear();
            resultsBoxSection.getItems().addAll(uni);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resultsBoxSection.setVisible(false);
        messageSection.setVisible(false);
    }

}

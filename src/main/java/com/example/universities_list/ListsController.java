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
    private Button detailsButton;

    @FXML
    void details(ActionEvent event) throws IOException {
        Uni uni = resultsBoxSection.getSelectionModel().getSelectedItem();
        SceneChanger.changeScenes(event, "details-view.fxml", uni.arrayToString() , uni.getName(), uni.getCountry(), uni.arrayToStringDomain(), uni.getAlpha_two_code());
    }

    @FXML
    void search(ActionEvent actionEvent) throws IOException, InterruptedException {

        APIUtility.getUniversitiesList(textFieldSection.getText());
        Uni[] uni = APIUtility.getUniversitiesListFromFile();

                    if (resultsBoxSection != null) {
                        resultsBoxSection.getItems().addAll(uni);
                        resultsBoxSection.setVisible(true);
                        resultsBoxSection.getItems().clear();
                        resultsBoxSection.getItems().addAll(uni);
                        messageSection.setVisible(true);
                        messageSection.setText("Universities found");
                        messageSection.getText();
                    } else {
                        resultsBoxSection.getItems().addAll(uni);
                        resultsBoxSection.setVisible(true);
                        resultsBoxSection.getItems().clear();
                        resultsBoxSection.getItems().addAll(uni);
                        messageSection.setVisible(true);
                        messageSection.setText("No Universities found");
                        messageSection.getText();
                    }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resultsBoxSection.setVisible(false);
        messageSection.setVisible(false);

        resultsBoxSection.getSelectionModel().selectedItemProperty().addListener((obs, old, videoSelected) ->{
            if(resultsBoxSection != null){
                try{
                    messageSection.setVisible(true);
                    messageSection.setText("Click Above to See Details!");
                    messageSection.getText();
                }
                catch(NullPointerException e) {
                    messageSection.setVisible(true);
                   messageSection.setText("Please Select University");
                   messageSection.getText();
                }
                messageSection.setVisible(true);
            }
        });



    }
}

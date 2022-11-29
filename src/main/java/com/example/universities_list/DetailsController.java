package com.example.universities_list;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class DetailsController {

    @FXML
    private Label countryLabel;

    @FXML
    private Label domainsLabel;

    @FXML
    private Label universityNameLabel;

    @FXML
    private Label webPageLabel;

    @FXML
    void backToHomePage(ActionEvent event) throws IOException {
        SceneChanger.changeScenesToHomePage(event, "list-view.fxml");
    }

    public void getUniDetailsCountry(String country ){
        countryLabel.setText("Country: "+ country);
    }

    public void getUniDetailsWebPage(String web_Pages){
        webPageLabel.setText("Web Page: "+ web_Pages);

    }

    public void getUniDetailsName(String name){
        universityNameLabel.setText("University Name: "+ name);
    }

}

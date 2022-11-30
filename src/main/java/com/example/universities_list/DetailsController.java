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
    private Label nameLabel;

    @FXML
    private Label webPageLabel;

    @FXML
    private Label alphaLabel;

    @FXML
    void backToHomePage(ActionEvent event) throws IOException {
        SceneChanger.changeScenesToHomePage(event, "list-view.fxml");
    }

    public void getUniDetailsWebPage(String web_Pages){
        webPageLabel.setText("Web Page:   "+ web_Pages);
    }

    public void getUniDetailsName(String name){
        nameLabel.setText("Name:   "+ name);
    }

    public void getUniDetailsCountry(String country ){
        countryLabel.setText("Country:   "+ country);
    }

    public void getUniDetailsDomains(String domains){
        domainsLabel.setText("Domains:   "+ domains);
    }

    public void getUniDetailsAlphaCode(String alpha_code){
        alphaLabel.setText("Alpha Code:  "+ alpha_code);
    }

}

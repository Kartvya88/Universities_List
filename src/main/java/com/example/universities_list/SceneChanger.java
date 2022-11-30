package com.example.universities_list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneChanger{
    public static void changeScenes(ActionEvent event, String fxmlFileName,  String web_Pages, String name, String country, String domains, String alpha_two_code) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        DetailsController controller = fxmlLoader.getController();
        controller.getUniDetailsCountry(country);
        controller.getUniDetailsWebPage(web_Pages);
        controller.getUniDetailsDomains(domains);
        controller.getUniDetailsAlphaCode(alpha_two_code);
        controller.getUniDetailsName(name);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScenesToHomePage(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

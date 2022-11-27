package com.example.universities_list;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("list-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Universities");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("image/logo.png")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        APIUtility.getUniversitiesList("India");
        APIResponse[] uni = APIUtility.getUniversitiesListFromFile();
        launch();
    }
}
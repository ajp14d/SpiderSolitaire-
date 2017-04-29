/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spidersolitairefxml;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Schism
 */
public class SpiderSolitaireFXML extends Application {
    
    private static final int WIDTH = 680;
    private static final int HEIGHT = 500;
    private static final int MARGIN_OUTER = 10;
    private static final String TITLE = "Spider Solitaire";
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass()
                .getResource("FXMLDocument.fxml"));
        primaryStage.setTitle("Spider Solitaire");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
    
     public static void main(String[] args) {
        launch(args);
    }
    
}

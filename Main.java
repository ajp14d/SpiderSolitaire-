import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application  {
    
    Stage window;
    Scene scene1;
    Scene scene2;
    Button button1;
    Button button2;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        
        Label label1 = new Label("Welcome to the first label");
        primaryStage.setTitle("Spider Solitaire");
        button1 = new Button();
        button1.setText("Card One");
        button1.setOnAction(e -> {
            System.out.println("Whaddup bitches");
            window.setScene(scene2);
        });
        
        //Layout 1 = children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);
        
        //Button 2
        button2 = new Button();
        button2.setText("Card Two");
        button2.setOnAction(e -> {
            System.out.println("This shit is clean");
            window.setScene(scene1);
        });
        
        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);
        
        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();
        
        
    }
}

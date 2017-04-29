import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
//<<<<<<< patch-8
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//=======
//>>>>>>> master
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SpiderSolitaire extends Application  {
    
    private static final int WIDTH = 680;
    private static final int HEIGHT = 500;
    private static final int MARGIN_OUTER = 10;
    private static final String TITLE = "Spider Solitaire";
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
//<<<<<<< patch-8
    
    
    
//=======
// master
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(TITLE);
        
        GridPane root = new GridPane();
        root.setStyle("-fx-background-color: deeppink;");
        root.setHgap(MARGIN_OUTER);
        root.setVgap(MARGIN_OUTER);
        root.setPadding(new Insets(MARGIN_OUTER));
        
//<<<<<<< patch-8
        ImageView image = new ImageView(new Image(getClass()
            .getResourceAsStream("/Resources/2c.gif")));
        root.getChildren().add(image);
        
        
        
        
        
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
        
//=======
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();    
//>>>>>>> master
    }
}

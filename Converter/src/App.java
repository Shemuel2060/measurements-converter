import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application{
 
    @Override
    public void start(Stage stage) throws Exception {
        // create stage
        stage = new Stage();

        // create scene
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 500);

        stage.setScene(scene);
        stage.setTitle("Measurements Converter");
        try{
            /* 
            one approach....
            Image logo = new Image(App.class.getResourceAsStream("../Arola.png"));
            stage.getIcons().add(logo); */
            var appIcon = new Image("/images/Arola.png");
            stage.getIcons().add(appIcon);
        } catch (Exception e) {
            System.out.println("\nAn error occured while getting logo\n");
            System.out.println(e.getMessage());

        }        

        stage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

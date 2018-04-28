package view;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage fenster) throws Exception {
        //---------------------------------------------
        // preparation for loading of layout
        //---------------------------------------------
        URL url = getClass().getResource("layout.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        //---------------------------------------------
        // controller for function
        //---------------------------------------------        
        loader.setController(new View()); 

        //---------------------------------------------
        // load layout
        //---------------------------------------------
        Parent parent = loader.load();
        fenster.setScene(new Scene(parent));

        //---------------------------------------------
        // show window
        //---------------------------------------------
        fenster.setTitle("JavaFX MVP");
        fenster.setMinHeight(125.0);
        fenster.setMinWidth(200.0);
        fenster.show();
    }
}

package Converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * To start the created application if It has error(s) It will print Exception creating scene then follow by exception.
 * @author Raksani Khunamas.
 */

public class Main extends Application {

        @Override
        public void start(Stage stage) {
            try {
                Parent root = (Parent) FXMLLoader.load(
                        getClass().getResource("ConverterUI.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.sizeToScene( );
                stage.show();
            } catch(Exception e) {
                System.out.println("Exception creating scene: "+e.getMessage());
            }
        }

    /**
     * start the application.
     * @param args
     */
    public static void main(String[] args) {

        Application.launch(args);
    }
}

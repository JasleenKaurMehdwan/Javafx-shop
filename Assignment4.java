/*
 * Programmer Name- Jasleen Kaur
 * Date- 26 July,2020
 * Program- To calculate the cost of items selected by the user.
 */
package assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jasle
 */
public class Assignment4 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //main method
    {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception
    {
       Parent root = FXMLLoader.load(getClass().getResource("Assignment4.fxml"));
        stage.setTitle("Testing");        
        stage.setScene(new Scene(root));
        stage.show();
    }
}
    
    


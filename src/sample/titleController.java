package sample;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by Shantanu on 6/12/2016.
 * Controller Class for title.fxml
 */
public class titleController implements Initializable {
    @FXML
    private Button start;
    @FXML
    private Button quit;
    @FXML
    private Button register;

    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'title.fxml'.";
        assert quit != null : "fx:id=\"quit\" was not injected: check your FXML file 'title.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'title.fxml'.";

        start.setOnAction((event) -> {
            // Button was clicked, do something...
            try {
                onStart(event);
            } catch (Exception e) {
                e.getMessage();
            }
        });

        quit.setOnAction(event -> {
            System.exit(0);
        });
    }

    @FXML
    private void onStart(ActionEvent event) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            root.getStylesheets().add(getClass().getResource("buttons.css").toExternalForm());
            Group g = new Group(root);
            Scene scene = new Scene(g, 421, 357);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();
    }
}


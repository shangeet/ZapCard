package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import model.Card;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Card card = new Card("ç°ì˙ÇÕ","Hello");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group rooot = new Group();
        Scene scene = new Scene(rooot, 540, 210);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
        MediaView mediaView = new MediaView(card.playSound());
        ((Group)scene.getRoot()).getChildren().add(mediaView);
    }
    public static void main(String[] args) {
        launch(args);
    }
}

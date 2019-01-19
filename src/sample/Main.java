package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {

    static Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception{
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Hello World");
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setScene(scene);
            primaryStage.show();

;

    }




    public static void main(String[] args) {
        ServerThread st = new ServerThread();
        st.start();

        launch(args);


    }
}

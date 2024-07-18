package rs.oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApp.class.getResource("view/salesmanager/sales_m-dashboard.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(StartApp.class.getResource("view/supervisor/supervisor-dashboard.fxml"));

        Scene scene = new Scene(fxmlLoader.load());


        stage.setTitle("Sales Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package cl.sphinxgo.feriapos.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label mensaje = new Label("Bienvenido a FeriaPOS");

        StackPane root = new StackPane();
        root.getChildren().add(mensaje);

        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("FeriaPOS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
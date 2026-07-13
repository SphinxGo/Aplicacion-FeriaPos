package cl.sphinxgo.feriapos.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/menu-principal.fxml"));

        Scene scene = new Scene(loader.load());

        stage.setTitle("FeriaPOS");
        stage.setScene(scene);
        stage.setWidth(900);
        stage.setHeight(700);
        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package cl.sphinxgo.feriapos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuPrincipalController {
    @FXML
    private void abrirCaja(ActionEvent event){

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/caja.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);

        Button boton = (Button) event.getSource();
        Stage stage = (Stage) boton.getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirCocina(ActionEvent event){

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/cocina.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);

        Button boton = (Button) event.getSource();
        Stage stage = (Stage) boton.getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }
}

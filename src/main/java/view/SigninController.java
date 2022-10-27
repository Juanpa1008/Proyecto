package view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SigninController {
    /**
     * función para cerrar la ventana de Home page y volver al Login
     */
    public void closeWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

    }
}

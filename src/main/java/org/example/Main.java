package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Campo de texto
        TextField txtDireccion = new TextField();
        txtDireccion.setPromptText("Introduce una dirección");

        // Botón
        Button boton = new Button("Confirmar");

        // Evento
        boton.setOnAction(e -> mostrarConfirmacion(txtDireccion));

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                new Label("Dirección:"),
                txtDireccion,
                boton
        );

        Scene scene = new Scene(root, 350, 200);

        primaryStage.setTitle("Formulario dirección");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método privado
    private void mostrarConfirmacion(TextField txtDireccion) {

        String direccion =
                txtDireccion.getText();

        Alert alerta =
                new Alert(Alert.AlertType.INFORMATION);

        alerta.setTitle("Confirmación");
        alerta.setHeaderText("Dirección registrada");

        alerta.setContentText(
                "La dirección es: " + direccion
        );

        alerta.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

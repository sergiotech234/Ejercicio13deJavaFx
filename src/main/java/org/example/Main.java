package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Etiqueta
        Label lblPais = new Label("Seleccione un país:");

        // ComboBox
        ComboBox<String> comboPais = new ComboBox<>();
        comboPais.getItems().addAll(
                "España",
                "México",
                "Argentina",
                "Colombia",
                "Chile"
        );

        // Botón
        Button btnMostrar = new Button("Mostrar");

        // Evento del botón
        btnMostrar.setOnAction(e -> {
            String pais = comboPais.getValue();

            if (pais != null) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("País seleccionado");
                alert.setHeaderText(null);
                alert.setContentText("Has seleccionado: " + pais);
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Advertencia");
                alert.setHeaderText(null);
                alert.setContentText("Seleccione un país.");
                alert.showAndWait();
            }
        });

        // Layout
        VBox root = new VBox(10, lblPais, comboPais, btnMostrar);
        root.setPadding(new Insets(15));

        // Escena
        Scene scene = new Scene(root, 300, 180);

        stage.setTitle("Formulario País");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
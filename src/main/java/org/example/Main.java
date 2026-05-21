package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Campo de texto donde el usuario introduce la dirección
        TextField txtDireccion = new TextField();

        // Texto guía que aparece dentro del campo
        txtDireccion.setPromptText("Introduce una dirección");

        // Creación del botón
        Button boton = new Button("Confirmar");

        // Evento del botón:
        // Al pulsarlo llama al método mostrarConfirmacion()
        // y le pasa el campo de texto
        boton.setOnAction(
                e -> mostrarConfirmacion(txtDireccion)
        );

        // Crear un VBox con separación de 15 píxeles
        VBox root = new VBox(15);

        // Centrar todos los componentes
        root.setAlignment(Pos.CENTER);

        // Añadir elementos al VBox
        root.getChildren().addAll(
                new Label("Dirección:"),
                txtDireccion,
                boton
        );

        // Crear escena con tamaño 350x200
        Scene scene = new Scene(root, 350, 200);

        // Título de la ventana
        primaryStage.setTitle("Formulario dirección");

        // Asignar escena
        primaryStage.setScene(scene);

        // Mostrar ventana
        primaryStage.show();
    }

    // Método privado encargado de mostrar la alerta
    private void mostrarConfirmacion(
            TextField txtDireccion) {

        // Obtener el texto escrito
        String direccion =
                txtDireccion.getText();

        // Crear una ventana emergente informativa
        Alert alerta =
                new Alert(
                        Alert.AlertType.INFORMATION
                );

        // Configurar título
        alerta.setTitle("Confirmación");

        // Configurar encabezado
        alerta.setHeaderText(
                "Dirección registrada"
        );

        // Mostrar mensaje con la dirección escrita
        alerta.setContentText(
                "La dirección es: " + direccion
        );

        // Mostrar alerta y esperar respuesta
        alerta.showAndWait();
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        launch(args);
    }
}

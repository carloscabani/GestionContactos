package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static String pathFiles = "C:\\Users\\Abeni\\OneDrive\\Documentos\\Archivos ESPOL\\Cuarto Semestre\\Estructura de datos\\Poryecto ED Primer parcial\\AppContactos\\src\\main\\resources\\Files";
    public static String pathPhotos = "photos/";

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 462, 598);
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:Imagenes/icono.jpg"));
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto.gestioncontacto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class PrimaryController implements Initializable {

    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String direccionImage = "/icons/llamada.png";
        
        Image image = new Image(getClass().getResourceAsStream(direccionImage));
        imageView.setImage(image);
    }    
    
    @FXML
    private void empezar(MouseEvent event) throws IOException {
        
        App.setRoot("secondary");
    }

}

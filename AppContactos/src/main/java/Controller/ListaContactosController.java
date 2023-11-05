/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Clases.*;
import ListTDA.ArrayListGroup9;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Abeni
 */
public class ListaContactosController implements Initializable {
    
    
    // ArrayList del pauqete de java porque falta hacer el metodo Iterable en la listGroup9
    public static ArrayList<Contacto> lstcontactos = new ArrayList<>();
    public static ArrayList<Contacto> listaContacts = new ArrayList<>();
    public static ListView<String> listContactos = new ListView<>();
    public static VBox contenerdorList = new VBox();

    @FXML
    private HBox hbCabezera;
    @FXML
    private Label lbcontactos;
    @FXML
    private TextField txBuscador;
    @FXML
    private VBox vblista;
    
    @FXML
    private HBox hbAnadir;
    @FXML
    private Button btagregar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LocalDate ler = null ;
        listaContacts.add(new Contacto("Leonel","Messi",new Telefono("Movil","9999999"),new Direccion("casa","Buenos Aires"),new Email("Trabajo","@eeeee"),new PersonaAdiconal("PEPE","Hijo"), new Fecha("cumpleaños",ler),"facebook","Banco Guayaquil"));
        listaContacts.add(new Contacto("Zlatan","Ibrahamovich",new Telefono("Movil","5555555"),new Direccion("casa","Suecia"),new Email("Trabajo","@eeeee"),new PersonaAdiconal("PEPE","Hijo"), new Fecha("cumpleaños",ler),"facebook","Banco Guayaquil"));

        //lstcontactos.add(new Contacto("messi","55555","Buneos Aires"));
        //lstcontactos.add(new Contacto("Ronaldo","55555","Buneos Aires"));
        contenerdorList.getChildren().clear();
        //cargarContactos();
        
        cargarListView();
        
        
        
    }  
    
//    public void cargarContactos(){
//        try(BufferedReader br = new BufferedReader(new FileReader(App.pathFiles+"Contactos.txt",StandardCharsets.UTF_8))){
//            String linea= br.readLine();
//            while (linea != null) {
//                String p[]=linea.split(",");
//                String nombre = p[0];
//                String Telefono = p[1];
//                String direccion = p[2];
//                
//                lstcontactos.add(new Contacto(nombre,Telefono,direccion));
//                linea= br.readLine();
//            }
//        }
//        catch(FileNotFoundException ex){
//            System.out.println("No se pudo encontrar el archivo");
//        }
//        catch(IOException e){
//            System.out.println("ERROOOORRR.......");
//        }
//    }
    public void cargarListView() {
        if (listContactos != null) {
            listContactos.getItems().clear();

            for (Contacto c : listaContacts) {
                
                listContactos.getItems().add(c.getNombre());
            }
        }
        
        contenerdorList.getChildren().add(listContactos);
        vblista.getChildren().add(contenerdorList);
        
    }
    
  

    @FXML
    private void VentanaCrear(ActionEvent event) throws IOException {
        contenerdorList.getChildren().clear();
        App.setRoot("CreacionContactos");
        
        
    }
}
    



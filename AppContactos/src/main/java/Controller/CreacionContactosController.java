/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Clases.*;
import static Controller.ListaContactosController.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Abeni
 */
public class CreacionContactosController implements Initializable {
    
    public static ArrayList<String> etiqueta1 = new ArrayList<>();
    public static ArrayList<String> etiqueta2 = new ArrayList<>();
    public static ArrayList<String> etiqueta3 = new ArrayList<>();
    public static ArrayList<String> etiqueta4 = new ArrayList<>();

    ComboBox c1 = new ComboBox();
    Label l1 = new Label("Persona Contacto:");
    Label l2 = new Label("Sitio Web:");
    Label l3 = new Label("Empresa:");
    TextField tperContacto = new TextField();
    TextField tempresa = new TextField();
    TextField tsitioweb = new TextField();
    
    @FXML
    private TextField txnombre;
    @FXML
    private TextField txtelefono;
    @FXML
    private TextField txdireccion;
    @FXML
    private TextField txapellido;
    private TextField txtrabajo;
    @FXML
    private TextField txemail;
    @FXML
    private DatePicker txcalendario;
    @FXML
    private Button btguardar;
    @FXML
    private Button btback;
    @FXML
    private VBox vbcamposopcionales;
    @FXML
    private HBox hbpercontacto;
    @FXML
    private HBox hbsitioweb;
    @FXML
    private HBox hbempresa;
    @FXML
    private Button btcampos;
    @FXML
    private ComboBox<String> cbdireccion;
    @FXML
    private ComboBox<String> cbtelefono;
    @FXML
    private ComboBox<String> cbemail;
    @FXML
    private ComboBox<String> cbfecha;
    @FXML
    private Button btocultar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cargarEtiquetas();
        guardarDatos();
        camposAdicionales();
        
        cargarCombobox();
    }
    
    public void guardarDatos() {
        btguardar.setOnAction((ActionEvent e) -> {
            String Nombre = txnombre.getText();
            String Apellido = txapellido.getText();
            String Tel = txtelefono.getText();
            String direccion = txdireccion.getText();
            
            Contacto c= new Contacto(Nombre,Tel,direccion);
            
            ListaContactosController.lstcontactos.add(c);
            
            txnombre.clear();
            txapellido.clear();
            txtelefono.clear();
            txdireccion.clear();
            txemail.clear();
            tperContacto.clear();
            tempresa.clear();
            tsitioweb.clear();
            c1.setValue("");
            cbdireccion.setValue("");
            cbtelefono.setValue("");
            cbemail.setValue("");
            cbfecha.setValue("");
           
            //contenerdorList.getChildren().clear();
            //ListaContactosController.listContactos.getItems().clear();

        });
    }
    
    public void regresar() {
        btback.setOnAction((ActionEvent e) -> {
            
        });

    }

    @FXML
    private void ventanaContactos(ActionEvent event) throws IOException {
        
        App.setRoot("ListaContactos");
        
    }
    
    public void camposAdicionales() {
        btcampos.setOnAction((ActionEvent e) -> {
           

            
            hbpercontacto.getChildren().addAll(l1,tperContacto,c1);
            hbpercontacto.setSpacing(20);
            hbsitioweb.getChildren().addAll(l2,tsitioweb);
            hbsitioweb.setSpacing(70);
            hbempresa.getChildren().addAll(l3,tempresa);
            hbempresa.setSpacing(70);
            
        });
    }
    
    public void cargarEtiquetas() {
        //llenado de etiqueta1
        etiqueta1.add("Movil");
        etiqueta1.add("Trabajo");
        etiqueta1.add("Casa");
        etiqueta1.add("Principal");
        etiqueta1.add("Fax del Trabajo");
        //llenado de etiqueta2
        etiqueta2.add("Trabajo");
        etiqueta2.add("Casa");
        etiqueta2.add("Otro");
        //llenado de etiqueta3
        etiqueta3.add("Cumpleaños");
        etiqueta3.add("Aniversario");
        etiqueta3.add("Otro");
        //llenado de etiqueta4
        etiqueta4.add("Asistente");
        etiqueta4.add("Hermano");
        etiqueta4.add("Hijo");
        etiqueta4.add("Padre");
        etiqueta4.add("Amigo");
        etiqueta4.add("Jefe");
        etiqueta4.add("Esposa");
        
          
    }
    
    public void cargarCombobox(){
        for(String s:etiqueta2){
            cbdireccion.getItems().add(s);
            cbemail.getItems().add(s);
        }
        for(String p:etiqueta1){
            cbtelefono.getItems().add(p);
        }
        for(String a:etiqueta3){
            cbfecha.getItems().add(a);
        }
        for(String b:etiqueta4){
            c1.getItems().add(b);
        }
    }

    @FXML
    private void ocultarCampos(ActionEvent event) {
        hbpercontacto.getChildren().clear();
        hbsitioweb.getChildren().clear();
        hbempresa.getChildren().clear();
    }

    
 
    
}
